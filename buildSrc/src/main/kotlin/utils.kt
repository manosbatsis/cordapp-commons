import net.corda.plugins.CordappExtension
import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test

import org.gradle.kotlin.dsl.*

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/** Configures the current project as a Kotlin project */
fun Project.kotlinProject() {
    this.plugins.apply("kotlin")
    dependencies {
        "implementation"(kotlin("stdlib", kotlinVersion))
        "implementation"(kotlin("reflect", kotlinVersion))
        "testImplementation"(kotlin("test", kotlinVersion))
    }
    tasks.withType<KotlinCompile> {
        kotlinOptions {
            languageVersion = "1.2"
            apiVersion = "1.2"
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
            javaParameters = true   // Useful for reflection.
        }
    }

}

/** Configures the current project as tested via JUnit 5 (Jupiter) */
fun Project.jupiterProject() {
    dependencies {
        "testImplementation"(Dependencies.TestLibs.junitJupiterApi)
        "testImplementation"(Dependencies.TestLibs.junitJupiterParams)
        "testRuntimeOnly"(Dependencies.TestLibs.junitJupiterEngine)
    }
    tasks.withType<Test> {
        useJUnitPlatform()
        testLogging {
            events("passed", "skipped", "failed", "standardOut", "standardError")
        }
    }
}

/** Configures the current project as Cordapp project */
fun Project.cordappProject() {
    this.plugins.apply("net.corda.plugins.cordapp")
    this.plugins.apply("net.corda.plugins.cordformation")
    this.plugins.apply("net.corda.plugins.quasar-utils")

    dependencies {
        "cordaCompile"(Dependencies.Libs.cordaCore)
        "testImplementation"(Dependencies.TestLibs.cordaNodeDriver)
    }
    configure<CordappExtension> {
        info{
            targetPlatformVersion = 4
        }
    }
}