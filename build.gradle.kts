plugins {
    `java-library`
    id("me.xtrm.atlas.gradle") version "0.0.1"
}

// These variables are defined in the `gradle.properties` file, go check it out!
group = project.properties["group"] as String
version = project.properties["version"] as String

dependencies {
}