import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.withGlide() {
    add("implementation", "com.github.bumptech.glide:glide:4.12.0")
    add("kapt", "com.github.bumptech.glide:compiler:4.12.0")
}