package com.felippeneves.kotlin_compose_mvi_animals_app.di

import com.felippeneves.kotlin_compose_mvi_animals_app.data.repository.AnimalRepositoryImpl
import com.felippeneves.kotlin_compose_mvi_animals_app.data.source.remote.AnimalDataSource
import com.felippeneves.kotlin_compose_mvi_animals_app.domain.repository.AnimalRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun provideAnimalRepository(remoteDataSource: AnimalDataSource): AnimalRepository =
        AnimalRepositoryImpl(remoteDataSource = remoteDataSource)
}