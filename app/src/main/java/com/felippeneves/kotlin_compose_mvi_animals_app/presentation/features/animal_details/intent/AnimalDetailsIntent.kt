package com.felippeneves.kotlin_compose_mvi_animals_app.presentation.features.animal_details.intent

sealed class AnimalDetailsIntent {
    data object LoadAnimalDetails : AnimalDetailsIntent()
}
