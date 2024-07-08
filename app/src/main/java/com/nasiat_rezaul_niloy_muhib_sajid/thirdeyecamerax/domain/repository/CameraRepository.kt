package com.nasiat_rezaul_niloy_muhib_sajid.thirdeyecamerax.domain.repository

import android.content.Context
import androidx.camera.view.LifecycleCameraController

interface CameraRepository {

    suspend fun takePhoto (
        controller: LifecycleCameraController
    )

    suspend fun recordVideo (
        controller: LifecycleCameraController,
        context: Context
    )
}