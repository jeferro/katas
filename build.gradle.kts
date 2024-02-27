plugins {
    id("org.jetbrains.kotlin.jvm") version Versions.kotlin
}

allprojects {
    group = "com.jeferro.katas"
    version = "1.0.0"

    apply {
        plugin("org.jetbrains.kotlin.jvm")
    }

    repositories {
        mavenLocal()
        mavenCentral()
    }

    kotlin {
        jvmToolchain(Versions.jdk)
        compilerOptions {
            if (System.getProperty("idea.active") == "true") {
                freeCompilerArgs.add("-Xdebug")
            }
        }
    }
}