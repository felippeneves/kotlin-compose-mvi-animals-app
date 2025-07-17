package com.felippeneves.kotlin_compose_mvi_animals_app.testutils.util

fun readJsonFromResource(fileName: String): String {
    val inputStream = ClassLoader.getSystemResourceAsStream(fileName)
        ?: error("Resource not found: $fileName")
    return inputStream.bufferedReader().use { it.readText() }
}
