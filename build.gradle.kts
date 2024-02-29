plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.21"
}

subprojects {
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
        jvmToolchain(17)
        compilerOptions {
            if (System.getProperty("idea.active") == "true") {
                freeCompilerArgs.add("-Xdebug")
            }
        }
    }

    tasks.withType<Test>() {
        useJUnitPlatform()
    }

    dependencies {
        // JUnit
        testImplementation("org.junit.jupiter", "junit-jupiter-engine", "5.10.2")
        testImplementation("org.mockito", "mockito-junit-jupiter", "5.10.0")
        testImplementation("org.mockito.kotlin", "mockito-kotlin", "5.2.1")
    }
}
