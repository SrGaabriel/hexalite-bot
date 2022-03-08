package org.hexalite.network.discord.bot.util

import com.typesafe.config.ConfigFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.hocon.Hocon
import kotlinx.serialization.hocon.decodeFromConfig
import org.hexalite.network.discord.bot.HexaliteBot
import java.io.File
import java.io.IOException

@Serializable
data class HexaliteConfig(
    val token: String,
    val database: HexaliteDatabaseConfig
)

@Serializable
data class HexaliteDatabaseConfig(
    val host: String,
    val port: String,
    val username: String,
    val password: String,
    val database: String
)

@OptIn(ExperimentalSerializationApi::class)
fun loadConfig(): HexaliteConfig = inspectFile("hexalite.conf").let { configFile ->
    Hocon.decodeFromConfig(ConfigFactory.parseFile(configFile))
}

private fun inspectFile(fileName: String, createIfNotExists: Boolean = true): File = File(fileName).also { file ->
    if (file.exists().not()) {
        if (createIfNotExists) {
            file.createNewFile()
            file.writeBytes(HexaliteBot::class.java.getResourceAsStream("/$fileName")?.readBytes()!!)
        }
        throw IOException("File $fileName was required but not found.")
    }
}