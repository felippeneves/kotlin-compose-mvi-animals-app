package com.felippeneves.kotlin_compose_mvi_animals_app.domain.model

data class Speed(
    val metric: String,
    val imperial: String
) {
    companion object {
        fun mock() = Speed(
            metric = "56",
            imperial = "35"
        )
    }
}
