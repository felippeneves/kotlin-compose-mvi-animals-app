package com.felippeneves.kotlin_compose_mvi_animals_app.domain.model

data class Taxonomy(
    val kingdom: String,
    val order: String,
    val family: String
) {
    companion object {
        fun mock() = Taxonomy(
            kingdom = "Animalia",
            order = "Carnivora",
            family = "Felidae"
        )
    }
}
