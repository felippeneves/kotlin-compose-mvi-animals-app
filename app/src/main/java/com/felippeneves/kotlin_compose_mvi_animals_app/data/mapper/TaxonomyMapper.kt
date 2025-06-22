package com.felippeneves.kotlin_compose_mvi_animals_app.data.mapper

import com.felippeneves.kotlin_compose_mvi_animals_app.data.model.TaxonomyResponse
import com.felippeneves.kotlin_compose_mvi_animals_app.domain.model.Taxonomy

fun TaxonomyResponse.toTaxonomy() = Taxonomy(
    kingdom = kingdom.orEmpty(),
    order = kingdom.orEmpty(),
    family = kingdom.orEmpty(),
)
