plugins {
    kotlin("jvm") version Dependencies.KotlinVersion
    kotlin("plugin.serialization") version Dependencies.KotlinVersion
}

group = "org.hexalite.network.discord.bot"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://repo.perfectdreams.net/")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(Dependencies.KordCore)
    implementation(Dependencies.DiscordInteraktions)

    implementation(Dependencies.KotlinxCoroutines)

    implementation(Dependencies.KotlinxSerializationJson)
    implementation(Dependencies.KotlinxSerializationHocon)

    implementation(Dependencies.ExposedCore)
    implementation(Dependencies.ExposedDao)
    implementation(Dependencies.ExposedJdbc)
    implementation(Dependencies.ExposedKotlinDatetime)

    implementation(Dependencies.HikariCP)
}