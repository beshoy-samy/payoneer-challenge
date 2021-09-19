import org.gradle.kotlin.dsl.DependencyHandlerScope

object TestDependencies {

    internal object AndroidVersions {
        const val junit = "1.1.3"
        const val espresso = "3.4.0"
    }

    internal object Versions {
        const val junit = "4.13.2"
    }

    object Android {
        const val junit = "androidx.test.ext:junit:${AndroidVersions.junit}"
        const val espresso = "androidx.test.espresso:espresso-core:${AndroidVersions.espresso}"
    }

    private const val junit = "junit:junit:${Versions.junit}"

    internal val dependencies = mapOf(
        "testImplementation" to listOf(junit),
        "androidTestImplementation" to listOf(Android.junit, Android.espresso)
    )
}

fun DependencyHandlerScope.withTestDependencies() {

    TestDependencies.dependencies.keys.forEach { libraryKey ->

        val libs = TestDependencies.dependencies[libraryKey]!!

        libs.forEach { add(libraryKey, it) }
    }

}