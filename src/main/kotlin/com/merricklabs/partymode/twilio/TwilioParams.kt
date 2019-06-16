package com.merricklabs.partymode.twilio

import com.merricklabs.partymode.twilio.TwilioFields.FROM
import java.net.URLDecoder

data class TwilioParams(val paramMap: Map<String, String>) {

    constructor(rawParams: String) : this(parseParams(rawParams))
    fun from(): String? = paramMap[FROM]

    private companion object {
        fun parseParams(rawParams: String): Map<String, String> {
            // Twilio POSTS an application/x-www-form-urlencoded string to this endpoint.
            // Build a map with it.
            return URLDecoder.decode(rawParams, "UTF-8")
                    .split("&")
                    .map { it.split("=") }
                    .map { it[0] to it[1] }
                    .toMap()
        }
    }
}