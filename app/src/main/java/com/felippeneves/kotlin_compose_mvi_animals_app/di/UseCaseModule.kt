package com.felippeneves.kotlin_compose_mvi_animals_app.di

import com.felippeneves.kotlin_compose_mvi_animals_app.domain.repository.AnimalRepository
import com.felippeneves.kotlin_compose_mvi_animals_app.domain.usecase.GetAnimalByNameUseCase
import com.felippeneves.kotlin_compose_mvi_animals_app.domain.usecase.GetAnimalByNameUseCaseImpl
import com.felippeneves.kotlin_compose_mvi_animals_app.domain.usecase.GetAnimalsUseCase
import com.felippeneves.kotlin_compose_mvi_animals_app.domain.usecase.GetAnimalsUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Singleton
    @Provides
    fun provideGetAnimalsUseCase(repository: AnimalRepository): GetAnimalsUseCase =
        GetAnimalsUseCaseImpl(repository = repository)

    @Singleton
    @Provides
    fun provideGetAnimalByNameUseCase(repository: AnimalRepository): GetAnimalByNameUseCase =
        GetAnimalByNameUseCaseImpl(repository = repository)
}
