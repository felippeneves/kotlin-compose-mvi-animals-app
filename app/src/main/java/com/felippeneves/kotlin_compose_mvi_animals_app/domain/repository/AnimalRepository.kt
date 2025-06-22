package com.felippeneves.kotlin_compose_mvi_animals_app.domain.repository

import com.felippeneves.kotlin_compose_mvi_animals_app.domain.model.Animal
import com.felippeneves.kotlin_compose_mvi_animals_app.domain.model.AnimalDetails

interface AnimalRepository {
    suspend fun getAnimals(): List<Animal>
    suspend fun getAnimalByName(name: String): AnimalDetails?
}
