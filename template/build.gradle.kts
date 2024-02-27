dependencies {
    // JUnit
    testImplementation("org.junit.jupiter", "junit-jupiter-engine", Versions.junit_engine)
    testImplementation("org.mockito", "mockito-junit-jupiter", Versions.junit_mockito)

    // Coroutines
    implementation("org.jetbrains.kotlinx", "kotlinx-coroutines-core", Versions.kotlinx_coroutines)
    testImplementation("org.jetbrains.kotlinx", "kotlinx-coroutines-test", Versions.kotlinx_coroutines)
}