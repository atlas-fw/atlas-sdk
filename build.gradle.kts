plugins {
    `java-library`
    id("me.xtrm.atlas.gradle") version "0.0.1"
}

// These variables are defined in the `gradle.properties` file, go check it out!
group = project.properties["group"] as String
version = project.properties["version"] as String

atlas {
    // Work in progress
}

dependencies {
    // Work in progress
//    mapping(atlas.api {
//        modules {
//            registry-v0
//            gui-v0
//            resources-v0
//        }
//    })
}
