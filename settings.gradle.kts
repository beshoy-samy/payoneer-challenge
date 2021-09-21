dependencyResolutionManagement {

    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "PayoneerChallenge"

include(":app")
include(":network")
include(":core")

include(":payment:payment-model")
include(":payment:payment-domain")
