package org.hexalite.network.discord.bot.command.impl

import dev.kord.core.Kord
import net.perfectdreams.discordinteraktions.common.commands.*
import net.perfectdreams.discordinteraktions.common.commands.options.ApplicationCommandOptions
import net.perfectdreams.discordinteraktions.common.commands.options.SlashCommandArguments

object SayCommand: SlashCommandDeclarationWrapper {
    override fun declaration(): SlashCommandDeclaration = slashCommand(
        name = "say",
        description = "Forces me to say something."
    ) {
        // executor = ""
    }
}

class SayCommandExecutor(private val kord: Kord): SlashCommandExecutor() {
    companion object: SlashCommandExecutorDeclaration(SayCommand::class) {
        override val options = Options

        object Options: ApplicationCommandOptions() {
            val text = string("text", "The text I should send").register()
        }
    }

    override suspend fun execute(context: ApplicationCommandContext, args: SlashCommandArguments) {
        val text = args[options.text]
        // val member = kord.defaultSupplier.getMember()
    }
}