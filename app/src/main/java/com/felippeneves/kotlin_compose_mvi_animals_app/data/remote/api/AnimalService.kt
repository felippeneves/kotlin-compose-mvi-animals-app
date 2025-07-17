package com.felippeneves.kotlin_compose_mvi_animals_app.data.remote.api

import com.felippeneves.kotlin_compose_mvi_animals_app.core.utils.ApiUtil
import com.felippeneves.kotlin_compose_mvi_animals_app.data.model.AnimalResponse
import retrofit2.http.GET

interface AnimalService {
    @GET(ApiUtil.ANIMALS_API)
    suspend fun getAnimals(): List<AnimalResponse>
}
