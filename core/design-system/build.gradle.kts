plugins {
    id("dev.spozap.library.compose")
    id("dev.spozap.library")
}

android {
    namespace = "dev.spozap.core.design_system"
}

dependencies {
    api(libs.androidx.material3)
}