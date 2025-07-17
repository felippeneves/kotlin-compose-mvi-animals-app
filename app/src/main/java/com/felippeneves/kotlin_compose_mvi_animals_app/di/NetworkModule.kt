package com.felippeneves.kotlin_compose_mvi_animals_app.di

import com.felippeneves.kotlin_compose_mvi_animals_app.core.utils.ApiUtil
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(ApiUtil.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
