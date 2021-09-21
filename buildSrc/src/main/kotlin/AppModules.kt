import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.project

fun DependencyHandlerScope.withNetworkModule() =
    add("api", project(":network"))

fun DependencyHandlerScope.withCoreModule() =
    add("api", project(":core"))