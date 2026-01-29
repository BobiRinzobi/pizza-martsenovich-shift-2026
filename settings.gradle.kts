pluginManagement {
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

rootProject.name = "Pizza"
include(":app")
include(":component")
include(":feature")
include(":shared")
include(":util")
include(":feature:pizza")
include(":feature:orders")
include(":feature:basket")
include(":feature:profile")
include(":feature:details")
include(":shared:pizza")
