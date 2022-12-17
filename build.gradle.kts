plugins {
    id("enterprises.stardust.atlas.gradle") version "0.0.1-SNAPSHOT"
}

// These variables are defined in the `gradle.properties` file, go check it out!
group = project.properties["group"] as String
version = project.properties["version"] as String

atlas {

}

dependencies {
    atlasRuntime("com.mojang:minecraft:1.12.2")
    //atlasRuntime("com.mojang:minecraft:1.16.5")
    //loader("enterprises.stardust.atlas:atlas-loader:0.0.1-SNAPSHOT")

    // Work in progress
//    mapping(atlas.api {
//        modules {
//            registry-v0
//            gui-v0
//            resources-v0
//        }
//    })
}
