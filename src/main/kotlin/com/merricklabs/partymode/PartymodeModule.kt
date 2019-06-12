package com.merricklabs.partymode

import com.merricklabs.partymode.bots.PartyBot
import com.merricklabs.partymode.config.PartymodeConfigImpl
import com.merricklabs.partymode.handlers.CallHandlerLogic
import com.merricklabs.partymode.handlers.SlackMessageHandlerLogic
import com.merricklabs.partymode.slack.SlackNotifier
import com.merricklabs.partymode.sns.SnsNotifier
import com.merricklabs.partymode.storage.PartymodeStorage
import com.merricklabs.partymode.util.PartymodeObjectMapper
import org.koin.dsl.module.module

val PartymodeModule = module {
    single { PartymodeConfigImpl() }
    single { PartymodeStorage() }
    single { CallHandlerLogic() }
    single { SlackMessageHandlerLogic() }
    single { SlackNotifier() }
    single { PartyBot() }
    single { PartymodeObjectMapper() }
    single { SnsNotifier() }
}