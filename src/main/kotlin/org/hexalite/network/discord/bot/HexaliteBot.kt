package org.hexalite.network.discord.bot

import dev.kord.core.Kord
import org.hexalite.network.discord.bot.util.HexaliteConfig

class HexaliteBot(val config: HexaliteConfig) {
    lateinit var kord: Kord

    suspend fun start() {
        kord = Kord(config.token)
        kord.login()
    }
}