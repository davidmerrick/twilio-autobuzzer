package io.github.davidmerrick.partymode.controllers.logic

import com.twilio.twiml.VoiceResponse
import com.twilio.twiml.voice.Dial
import com.twilio.twiml.voice.Play
import com.twilio.twiml.voice.Reject
import io.github.davidmerrick.partymode.config.PartymodeConfig
import io.github.davidmerrick.partymode.external.twilio.TwilioParams
import io.github.davidmerrick.partymode.sns.SnsNotifier
import io.github.davidmerrick.partymode.storage.PartymodeStorage
import mu.KotlinLogging
import javax.inject.Singleton

private val log = KotlinLogging.logger {}

@Singleton
class CallHandlerLogic(
        private val storage: PartymodeStorage,
        private val snsNotifier: SnsNotifier,
        private val config: PartymodeConfig
) {
    fun handleRequest(body: String): String {
        log.info("Received body: $body")

        val twilioParams = TwilioParams(body)
        twilioParams.from()?.let {
            if (it.contains(config.phone.callboxNumber) || it.contains(config.phone.myNumber)) {
                log.info("Received a valid call from callbox or my number.")
                return buildResponse()
            }
        }

        log.info("Invalid call. Rejecting.")
        return buildRejectResponse()
    }

    private fun buildRejectResponse(): String {
        val body = VoiceResponse.Builder()
                .reject(Reject.Builder().build())
                .build()
        return body.toXml()
    }

    private fun buildResponse(): String {
        if (storage.isPartymodeEnabled()) {
            log.info("Buzzing someone in.")
            pushNotifications()
            val body = VoiceResponse.Builder()
                    .play(Play.Builder().digits("ww999").build())
                    .build()
            return body.toXml()
        }

        val number = Number.Builder(config.phone.myNumber).build()
        val body = VoiceResponse.Builder()
                .dial(Dial.Builder().number(number).build())
                .build()
        return body.toXml()
    }

    private fun pushNotifications() {
        val message = "Buzzed someone in"
        if (config.sns.topicArn != null) {
            snsNotifier.notify(message)
        }
    }
}