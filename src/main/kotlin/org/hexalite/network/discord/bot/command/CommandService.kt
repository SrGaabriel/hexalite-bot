package org.hexalite.network.discord.bot.command

import dev.kord.common.entity.Snowflake
import net.perfectdreams.discordinteraktions.common.commands.CommandManager
import net.perfectdreams.discordinteraktions.platforms.kord.commands.KordCommandRegistry
import org.hexalite.network.discord.bot.HexaliteBot

suspend fun HexaliteBot.initCommands() {
    val commandManager = CommandManager()

    /*commandManager.register(

    )*/

    val registry = KordCommandRegistry(
        Snowflake(4),
        kord.rest,
        commandManager
    )

    registry.updateAllGlobalCommands(true)
}