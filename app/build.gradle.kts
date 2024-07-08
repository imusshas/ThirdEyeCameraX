plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    // Dagger-Hilt
    id("com.google.devtools.ksp")
    id ("com.google.dagger.hilt.android")
}

android {
    namespace = "com.nasiat_rezaul_niloy_muhib_sajid.thirdeyecamerax"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.nasiat_rezaul_niloy_muhib_sajid.thirdeyecamerax"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.0")
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation(platform("androidx.compose:compose-bom:2024.05.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2024.05.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    // Dagger-Hilt
    implementation ("com.google.dagger:hilt-android:2.50")
    ksp ("com.google.dagger:hilt-compiler:2.50")

    // For instrumentation tests
    androidTestImplementation  ("com.google.dagger:hilt-android-testing:2.50")
    kspAndroidTest ("com.google.dagger:hilt-compiler:2.50")

    // For local unit tests
    testImplementation ("com.google.dagger:hilt-android-testing:2.50")
    kspTest ("com.google.dagger:hilt-compiler:2.50")

    //Navigation
    implementation("androidx.navigation:navigation-compose:2.7.7")
    // For Collecting States From View Model
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.0")

    //Hilt-Navigation
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")


    // CameraX core library using the camera2 implementation
    val cameraxVersion = "1.3.3"
    // The following line is optional, as the core library is included indirectly by camera-camera2
    implementation ("androidx.camera:camera-core:${cameraxVersion}")
    implementation ("androidx.camera:camera-camera2:${cameraxVersion}")
    // If you want to additionally use the CameraX Lifecycle library
    implementation ("androidx.camera:camera-lifecycle:${cameraxVersion}")
    // If you want to additionally use the CameraX View class
    implementation ("androidx.camera:camera-view:1.3.3")
    // If you want to additionally use the CameraX Extensions library
    implementation ("androidx.camera:camera-extensions:1.3.3")


    // Extended Icons
    implementation("androidx.compose.material:material-icons-extended-android:1.6.7")
}