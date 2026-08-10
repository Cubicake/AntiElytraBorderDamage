plugins {
    id("java-library")
    id("xyz.jpenilla.run-paper") version "3.0.2"
}

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
    maven("https://maven.elmakers.com/repository/")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.11.2-R0.1-SNAPSHOT")
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(17)
}

tasks {
    runServer {
        minecraftVersion("1.17.1")

        jvmArgs(
            "-Xms2G",
            "-Xmx2G",
            "-Dcom.mojang.eula.agree=true"
        )
    }

    processResources {
        val props = mapOf(
            "version" to version,
            "description" to project.description
        )

        filesMatching("plugin.yml") {
            expand(props)
        }
    }
}