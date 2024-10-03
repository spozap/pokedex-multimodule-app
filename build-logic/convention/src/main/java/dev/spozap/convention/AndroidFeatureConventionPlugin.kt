package dev.spozap.convention

import com.android.build.gradle.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("dev.spozap.library")
            }

            extensions.configure<LibraryExtension> {
                testOptions.animationsDisabled = false
            }

            dependencies {
                add("implementation", project(":core:design-system"))
            }
        }
    }

}