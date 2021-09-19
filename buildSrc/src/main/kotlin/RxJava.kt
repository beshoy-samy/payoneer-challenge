import org.gradle.kotlin.dsl.DependencyHandlerScope

object RxJava {

    private const val version = "3.1.1"

    internal const val rxjava = "io.reactivex.rxjava3:rxjava:${version}"

}

fun DependencyHandlerScope.withRxjava() {
    add("implementation", RxJava.rxjava)
}