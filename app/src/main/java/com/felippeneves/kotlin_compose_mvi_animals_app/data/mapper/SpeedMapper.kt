package com.felippeneves.kotlin_compose_mvi_animals_app.data.mapper

import com.felippeneves.kotlin_compose_mvi_animals_app.data.model.SpeedResponse
import com.felippeneves.kotlin_compose_mvi_animals_app.domain.model.Speed

fun SpeedResponse.toSpeed() = Speed(
    metric = metric.orEmpty(),
    imperial = imperial.orEmpty()
)
