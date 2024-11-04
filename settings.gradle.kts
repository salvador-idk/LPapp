/*
pluginManagement
* This block is used to specify where to resolve plugins.
* */

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
/*
* dependencyResolutionManagement
* This block is used to specify where to resolve dependencies.
* */
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    /*
    *Repositories
    * block, which allows them to be used in all modules.
    *  */
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Login_MariaDB"
include(":app")
include(":mariadb-connector-java")
