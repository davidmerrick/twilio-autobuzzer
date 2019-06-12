package com.merricklabs.partymode.slack

import com.merricklabs.partymode.config.PartymodeConfig
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class SlackNotifier : KoinComponent {
    private val config: PartymodeConfig by inject()

    fun notify(message: String){
        val okHttpClient = OkHttpClient()
        val json = MediaType.get("application/json; charset=utf-8")
        val body = RequestBody.create(json, "{\"text\": \"$message\"}")
        val request = Request.Builder()
                .url(config.slack.webhookUri)
                .post(body)
                .build()
        okHttpClient.newCall(request).execute()
    }
}