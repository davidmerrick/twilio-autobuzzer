import kotlin.String

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Update this file with
 *   `$ ./gradlew buildSrcVersions` */
object Libs {
    /**
     * https://aws.amazon.com/sdkforjava */
    const val aws_java_sdk_dynamodb: String = "com.amazonaws:aws-java-sdk-dynamodb:" +
            Versions.aws_java_sdk_dynamodb

    /**
     * https://aws.amazon.com/sdkforjava */
    const val aws_java_sdk_sns: String = "com.amazonaws:aws-java-sdk-sns:" +
            Versions.aws_java_sdk_sns

    /**
     * https://aws.amazon.com/lambda/ */
    const val aws_lambda_java_core: String = "com.amazonaws:aws-lambda-java-core:" +
            Versions.aws_lambda_java_core

    /**
     * https://aws.amazon.com/lambda/ */
    const val aws_lambda_java_events: String = "com.amazonaws:aws-lambda-java-events:" +
            Versions.aws_lambda_java_events

    /**
     * https://aws.amazon.com/lambda/ */
    const val aws_lambda_java_log4j2: String = "com.amazonaws:aws-lambda-java-log4j2:" +
            Versions.aws_lambda_java_log4j2

    /**
     * http://github.com/FasterXML/jackson */
    const val jackson_annotations: String = "com.fasterxml.jackson.core:jackson-annotations:" +
            Versions.com_fasterxml_jackson_core

    /**
     * https://github.com/FasterXML/jackson-core */
    const val jackson_core: String = "com.fasterxml.jackson.core:jackson-core:" +
            Versions.com_fasterxml_jackson_core

    /**
     * http://github.com/FasterXML/jackson */
    const val jackson_databind: String = "com.fasterxml.jackson.core:jackson-databind:" +
            Versions.com_fasterxml_jackson_core

    /**
     * https://github.com/FasterXML/jackson-module-kotlin */
    const val jackson_module_kotlin: String =
            "com.fasterxml.jackson.module:jackson-module-kotlin:" + Versions.jackson_module_kotlin

    const val com_github_johnrengelman_shadow_gradle_plugin: String =
            "com.github.johnrengelman.shadow:com.github.johnrengelman.shadow.gradle.plugin:" +
            Versions.com_github_johnrengelman_shadow_gradle_plugin

    /**
     * https://github.com/square/okhttp */
    const val okhttp: String = "com.squareup.okhttp3:okhttp:" + Versions.okhttp

    /**
     * https://www.twilio.com */
    const val twilio: String = "com.twilio.sdk:twilio:" + Versions.twilio

    const val de_fayard_buildsrcversions_gradle_plugin: String =
            "de.fayard.buildSrcVersions:de.fayard.buildSrcVersions.gradle.plugin:" +
            Versions.de_fayard_buildsrcversions_gradle_plugin

    /**
     * https://github.com/MicroUtils/kotlin-logging */
    const val kotlin_logging: String = "io.github.microutils:kotlin-logging:" +
            Versions.kotlin_logging

    /**
     * http://www.github.com/kotlintest/kotlintest */
    const val kotlintest_runner_junit5: String = "io.kotlintest:kotlintest-runner-junit5:" +
            Versions.kotlintest_runner_junit5

    const val org_jetbrains_kotlin_jvm_gradle_plugin: String =
            "org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:" +
            Versions.org_jetbrains_kotlin_jvm_gradle_plugin

    /**
     * https://kotlinlang.org/ */
    const val kotlin_reflect: String = "org.jetbrains.kotlin:kotlin-reflect:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/ */
    const val kotlin_scripting_compiler_embeddable: String =
            "org.jetbrains.kotlin:kotlin-scripting-compiler-embeddable:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/ */
    const val kotlin_stdlib_jdk8: String = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:" +
            Versions.org_jetbrains_kotlin

    const val koin_core: String = "org.koin:koin-core:" + Versions.org_koin

    const val koin_test: String = "org.koin:koin-test:" + Versions.org_koin

    /**
     * http://www.slf4j.org */
    const val slf4j_api: String = "org.slf4j:slf4j-api:" + Versions.slf4j_api

    /**
     * http://www.slf4j.org */
    const val slf4j_jdk14: String = "org.slf4j:slf4j-jdk14:" + Versions.slf4j_jdk14

    /**
     * http://testng.org */
    const val testng: String = "org.testng:testng:" + Versions.testng
}
