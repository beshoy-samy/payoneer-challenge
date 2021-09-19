object Build {

    object Versions {
        const val gradleBuildTools = "7.0.2"
    }

    const val gradleBuildTools = "com.android.tools.build:gradle:${Versions.gradleBuildTools}"
    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Config.kotlinVersion}"
    const val hiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:${Hilt.version}"
    const val navigationSafeArgsPlugin =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Navigation.version}"

    object Plugins {
        const val androidApplicationPlugin = "com.android.application"
        const val androidLibraryPlugin = "com.android.library"
        const val kotlinAndroidPlugin = "android"
        const val kotlinKaptPlugin = "kapt"
        const val hiltAndroidPlugin = "dagger.hilt.android.plugin"
        const val kotlinParcelize = "kotlin-parcelize"
        const val navigationSafeArgs = "androidx.navigation.safeargs"
    }
}