package com.nasiat_rezaul_niloy_muhib_sajid.thirdeyecamerax.di

import com.nasiat_rezaul_niloy_muhib_sajid.thirdeyecamerax.domain.repository.CameraRepository
import com.nasiat_rezaul_niloy_muhib_sajid.thirdeyecamerax.data.repository.CameraRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class CameraRepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCameraRepository(
        cameraRepositoryImpl: CameraRepositoryImpl
    ): CameraRepository

}









