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

        register("androidApplication") {
            id = "dev.spozap.application"
            implementationClass = "dev.spozap.convention.AndroidApplicationConventionPlugin"
        }

        register("androidApplicationCompose") {
            id = "dev.spozap.application.compose"
            implementationClass = "dev.spozap.convention.AndroidApplicationComposeConventionPlugin"
        }

        register("androidFeature") {
            id = "dev.spozap.feature"
            implementationClass = "dev.spozap.convention.AndroidFeatureConventionPlugin"
        }

        register("androidLibraryCompose") {
            id = "dev.spozap.library.compose"
            implementationClass = "dev.spozap.convention.AndroidLibraryComposeConventionPlugin"
        }

        register("androidLibrary") {
            id = "dev.spozap.library"
            implementationClass = "dev.spozap.convention.AndroidLibraryConventionPlugin"
        }

        register("androidHilt") {
            id = "dev.spozap.hilt"
            implementationClass = "dev.spozap.convention.AndroidHiltConventionPlugin"
        }

    }

}