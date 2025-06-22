package com.felippeneves.kotlin_compose_mvi_animals_app.data.source.remote

import com.felippeneves.kotlin_compose_mvi_animals_app.data.model.AnimalResponse
import com.felippeneves.kotlin_compose_mvi_animals_app.data.remote.api.AnimalService
import javax.inject.Inject

interface AnimalDataSource {
    suspend fun getAnimals(): List<AnimalResponse>
}

class AnimalDataSourceImpl @Inject constructor(
    private val service: AnimalService
) : AnimalDataSource {
    override suspend fun getAnimals(): List<AnimalResponse> = service.getAnimals()
}
