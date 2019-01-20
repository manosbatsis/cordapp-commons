plugins {
    base
    kotlin("jvm") version "1.3.11" apply false
}

allprojects {

    group = "com.github.manosbatsis.cordapp"
    version = "0.1-SNAPSHOT"
    repositories {
        jcenter()
    }
}

dependencies {
    // Make the root project archives configuration depend on every subproject
    subprojects.forEach {
        archives(it)
    }
}