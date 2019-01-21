plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    maven(url = "https://ci-artifactory.corda.r3cev.com/artifactory/corda-releases")
}

dependencies {
    "implementation"("org.jetbrains.kotlin:kotlin-gradle-plugin")
    "implementation"("net.corda.plugins:cordapp:4.0.37")
}