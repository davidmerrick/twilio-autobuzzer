package com.merricklabs.partymode.bots

import com.merricklabs.echobot.slack.SlackCallbackMessage
import com.merricklabs.partymode.config.PartymodeConfigImpl
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

abstract class SlackBot : KoinComponent {
    protected val config: PartymodeConfigImpl by inject()

    protected fun shouldHandle(message: SlackCallbackMessage) = message.event.type == "app_mention"
        || (message.event.channel_type == "im" && message.event.subtype != "bot_message")
        || message.event.text.contains(config.slack.botName)

    abstract fun handle(message: SlackCallbackMessage)
}