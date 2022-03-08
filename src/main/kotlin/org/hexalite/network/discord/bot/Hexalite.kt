package org.hexalite.network.discord.bot

import org.hexalite.network.discord.bot.util.loadConfig

suspend fun main() {
    val hexalite = HexaliteBot(loadConfig())
    hexalite.start()
}