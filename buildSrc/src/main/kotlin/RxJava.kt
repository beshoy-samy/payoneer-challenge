import org.gradle.kotlin.dsl.DependencyHandlerScope

object RxJava {

    private const val version = "3.1.1"
    private const val android = "3.0.0"

    internal const val rxjava = "io.reactivex.rxjava3:rxjava:${version}"

    internal const val rxAndroid = "io.reactivex.rxjava3:rxandroid:${android}"
}

fun DependencyHandlerScope.withRxjava() {
    add("implementation", RxJava.rxjava)
}

fun DependencyHandlerScope.withRxAndroid(implementation: Boolean = false) {
    add(if (implementation) "implementation" else "api", RxJava.rxAndroid)
    add(if (implementation) "implementation" else "api", RxJava.rxjava)
}