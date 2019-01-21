
const val kotlinVersion = "1.2.71"//"1.3.11"

// Compile dependencies
const val cordaVersion = "4.0-SNAPSHOT"
const val cordaGradlePluginsVersion = "4.0.37"

// Test dependencies
const val junitJupiterVersion = "5.3.2"

object Dependencies {

    object BuildPlugins {
        val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        val cordaQuazarUtilsPlugin = "net.corda.plugins:quasar-utils:$cordaGradlePluginsVersion"
        val cordaCordformationPlugin = "net.corda.plugins:cordformation:$cordaGradlePluginsVersion"
        val cordaCordappPlugin = "net.corda.plugins:cordapp:$cordaGradlePluginsVersion"
    }

    object Libs {
        val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
        val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"
        val corda = "net.corda:corda:$cordaVersion"
        val cordaCore = "net.corda:corda-core:$cordaVersion"
        val cordaRpc = "net.corda:corda-rpc:$cordaVersion"
        val cordaJackson = "net.corda:corda-jackson:$cordaVersion"
    }

    object TestLibs {
        val kotlinTest = "org.jetbrains.kotlin:kotlin-test:$kotlinVersion"
        val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion"
        val junitJupiterParams = "org.junit.jupiter:junit-jupiter-params:$junitJupiterVersion"
        val junitJupiterEngine = "org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion"
        val cordaNodeApi = "net.corda:corda-node-api:$cordaVersion"
        val cordaTestCommon = "net.corda:corda-test-common:$cordaVersion"
        val cordaNodeDriver = "net.corda:corda-node-driver:$cordaVersion"
    }
}