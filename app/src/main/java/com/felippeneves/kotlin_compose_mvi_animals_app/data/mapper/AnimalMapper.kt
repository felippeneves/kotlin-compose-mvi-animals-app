package com.felippeneves.kotlin_compose_mvi_animals_app.data.mapper

import com.felippeneves.kotlin_compose_mvi_animals_app.data.model.AnimalResponse
import com.felippeneves.kotlin_compose_mvi_animals_app.domain.model.Animal
import com.felippeneves.kotlin_compose_mvi_animals_app.domain.model.AnimalDetails
import com.felippeneves.kotlin_compose_mvi_animals_app.domain.model.Speed
import com.felippeneves.kotlin_compose_mvi_animals_app.domain.model.Taxonomy

fun List<AnimalResponse>.toAnimalList(): List<Animal> = map { it.toAnimal() }

fun AnimalResponse.toAnimal(): Animal = Animal(
    name = name.orEmpty(),
    location = location.orEmpty(),
    image = image.orEmpty()
)

fun AnimalResponse.toAnimalDetails() = AnimalDetails(
    name = name.orEmpty(),
    taxonomy = taxonomy?.toTaxonomy(),
    location = location.orEmpty(),
    speed = speed?.toSpeed(),
    diet = diet.orEmpty(),
    lifespan = lifespan.orEmpty(),
    image = image.orEmpty()
)
