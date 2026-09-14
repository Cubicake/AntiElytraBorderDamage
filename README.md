## AntiElytraBorderDamage
A very simple plugin to prevent damage due to flying into the world border at high speed.

This is useful if you have players with zero situational awareness and a habit of flying into a bright blue pulsating wall.

## How it works
AntiElytraBorderDamage registers a lightweight bukkit listener that fires whenever a player experiences kinetic damage (damage from flying into something with an elytra). If the player is touching the world border, this damage is cancelled. This is highly accurate (even a trapdoor between the world border and the player will cause the player to receive the damage) while being incredibly lightweight and taking approximately 0% of your server's tick time.

## Supported Versions
AntiElytraBorderDamage is incredibly simple, so all Minecraft versions since MC 1.11.2 are supported, on all Spigot-derivative platforms including Folia. This simple design means that it should continue to work forever without updates.

AntiElytraBorderDamage is compiled with Java 17, so if you are running on a Minecraft version from 1.11.2-1.17.1, you will need to ensure that you are running on Java 17 and not Java 8-16. Minecraft versions 1.18.0+ require a higher Java version than AntiElytraBorderDamage, so it will always run with no modifications.

## Download
Download it at https://modrinth.com/plugin/antielytraborderdamage
