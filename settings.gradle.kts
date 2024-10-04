pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "pokedex-multimodule-app"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":app")
include(":features:pokemon_list")
include(":core:design-system")
include(":core:domain")
include(":core:models")
include(":core:data")
include(":core:network")
