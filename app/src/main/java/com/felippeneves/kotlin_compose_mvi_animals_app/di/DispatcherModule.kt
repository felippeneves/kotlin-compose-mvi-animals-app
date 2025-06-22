package com.felippeneves.kotlin_compose_mvi_animals_app.di

import com.felippeneves.kotlin_compose_mvi_animals_app.core.dispatcher.DefaultDispatcherProvider
import com.felippeneves.kotlin_compose_mvi_animals_app.core.dispatcher.DispatcherProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DispatcherModule {
    @Provides
    @Singleton
    fun provideDispatcherProvider(): DispatcherProvider = DefaultDispatcherProvider()
}
