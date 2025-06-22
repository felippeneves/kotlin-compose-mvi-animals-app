package com.felippeneves.kotlin_compose_mvi_animals_app.presentation.features.animal_list.intent

sealed class AnimalListIntent {
    data object LoadAnimals : AnimalListIntent()
}
