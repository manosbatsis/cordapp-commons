buildscript {
    repositories {
        jcenter()
        maven(url = "https://ci-artifactory.corda.r3cev.com/artifactory/corda-releases")
    }
    dependencies {
        classpath(Dependencies.BuildPlugins.kotlinGradlePlugin)
        classpath(Dependencies.BuildPlugins.cordaCordappPlugin)
        classpath(Dependencies.BuildPlugins.cordaCordformationPlugin)
        classpath(Dependencies.BuildPlugins.cordaQuazarUtilsPlugin)
    }
}

plugins {
    base
    kotlin("jvm")
}

allprojects {
    group = "com.github.manosbatsis.cordapp"
    version = "0.1-SNAPSHOT"
    repositories {
        jcenter()
        maven(url = "https://ci-artifactory.corda.r3cev.com/artifactory/corda-dev/")
        maven(url = "https://jitpack.io")
    }
}

dependencies {
    // Make the root project archives configuration depend on every sub-project
    subprojects.forEach {
        archives(it)
    }
}
