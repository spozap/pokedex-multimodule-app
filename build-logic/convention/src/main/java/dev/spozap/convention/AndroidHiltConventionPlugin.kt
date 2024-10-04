package dev.spozap.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.dependencies

class AndroidHiltConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(plugin = "com.google.devtools.ksp")
                apply(plugin = "com.google.dagger.hilt.android")
            }

            dependencies {
                add("implementation", libs.findLibrary("hilt").get())
                add("ksp", libs.findLibrary("hilt-compiler").get())
            }

        }

    }

}