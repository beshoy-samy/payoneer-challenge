import org.gradle.kotlin.dsl.DependencyHandlerScope

object Network {

    internal object Versions {
        const val retrofit = "2.9.0"
        const val moshi = "1.12.0"
        const val okhttp = "4.9.1"
    }

    internal const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    private const val moshiConverter =
        "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    private const val rxjavaAdapter =
        "com.squareup.retrofit2:adapter-rxjava3:${Versions.retrofit}"
    private const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    private const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    private const val okhttpInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"

    internal val dependencies = mapOf(
        "implementation" to listOf(moshiConverter, rxjavaAdapter, okhttp, okhttpInterceptor),
        "api" to listOf(retrofit, moshi),
    )

    internal val moshiDependencies =
        mapOf("implementation" to moshi)
}

fun DependencyHandlerScope.withNetworkDependencies() {

    Network.dependencies.keys.forEach { libraryKey ->

        val libs = Network.dependencies[libraryKey]!!

        libs.forEach { add(libraryKey, it) }
    }

}

fun DependencyHandlerScope.withMoshi() {
    Network.moshiDependencies.keys.forEach { libraryKey ->
        val lib = Network.moshiDependencies[libraryKey]!!
        add(libraryKey, lib)
    }
}

fun DependencyHandlerScope.withRetrofit() {
    add("implementation", Network.retrofit)
}