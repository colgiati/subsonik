plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    id("maven-publish")
}

android {
    namespace = "dev.olgiati.subsonik"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    kotlinOptions {
        jvmTarget = "21"
    }
}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "dev.olgiati.subsonik"
            artifactId = "subsonik"
            version = "0.2.1"

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}


dependencies {
    implementation(libs.coroutines)
    implementation(libs.retrofit)
    implementation(libs.converter.gson)

    testImplementation(kotlin("test"))
}