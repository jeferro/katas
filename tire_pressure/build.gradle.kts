
dependencies {
    // JUnit
    testImplementation("org.junit.jupiter", "junit-jupiter-engine", Versions.junit_engine)
    testImplementation("org.mockito", "mockito-junit-jupiter", Versions.junit_mockito)
    testImplementation("org.mockito.kotlin", "mockito-kotlin", Versions.mockito_kotlin)

    // Coroutines
    implementation("org.jetbrains.kotlinx", "kotlinx-coroutines-core", Versions.kotlinx_coroutines)
    testImplementation("org.jetbrains.kotlinx", "kotlinx-coroutines-test", Versions.kotlinx_coroutines)
}

tasks.withType<Test>() {
    useJUnitPlatform()
}
