plugins {
    id(Build.Plugins.javaLibraryPlugin)
    id(Build.Plugins.kotlinPlugin)
}

java {
    sourceCompatibility = Config.javaVersion
    targetCompatibility = Config.javaVersion
}

dependencies {
    withRxjava()
    withJavaInject()
    withTestDependencies()
}