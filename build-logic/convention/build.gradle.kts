plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.compose.gradlePlugin)
}

tasks {
    validatePlugins {
        enableStricterValidation = true
        failOnWarning = true
    }
}

gradlePlugin {

    plugins {

        register("androidLibraryCompose") {
            id = "dev.spozap.library.compose"
            implementationClass = "dev.spozap.convention.AndroidLibraryComposeConventionPlugin"
        }

        register("androidLibrary") {
            id = "dev.spozap.library"
            implementationClass = "dev.spozap.convention.AndroidLibraryConventionPlugin"
        }

    }

}