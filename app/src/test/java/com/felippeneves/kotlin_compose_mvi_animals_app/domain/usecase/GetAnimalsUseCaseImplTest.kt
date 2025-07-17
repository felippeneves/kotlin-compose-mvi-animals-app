package com.felippeneves.kotlin_compose_mvi_animals_app.domain.usecase

import com.felippeneves.kotlin_compose_mvi_animals_app.core.result.DataResult
import com.felippeneves.kotlin_compose_mvi_animals_app.domain.model.Animal
import com.felippeneves.kotlin_compose_mvi_animals_app.domain.repository.AnimalRepository
import com.felippeneves.kotlin_compose_mvi_animals_app.testutils.rules.MainDispatcherRule
import io.mockk.clearAllMocks
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import kotlin.test.assertEquals

class GetAnimalsUseCaseImplTest {
    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    private val repository: AnimalRepository = mockk()
    private lateinit var subject: GetAnimalsUseCase

    private val expectedLoading = DataResult.Loading

    // region Setup

    @Before
    fun setUp() {
        subject = GetAnimalsUseCaseImpl(
            repository = repository,
            dispatcher = mainDispatcherRule.dispatcher
        )
    }

    @After
    fun tearDown() {
        clearAllMocks()
    }

    // endregion Setup

    @Test
    fun `invoke should emit Loading and Success when repository returns animals`() =
        runTest(mainDispatcherRule.dispatcher) {
            // Given
            val animalList = Animal.mockList()
            val expected = DataResult.Success(animalList)
            val expectedEmissionCount = 2
            coEvery { repository.getAnimals() } returns animalList

            // When
            val result = subject.invoke().toList()

            // Then
            assertEquals(expectedEmissionCount, result.size)
            assertEquals(expectedLoading, result.first())
            assertEquals(expected, result.last())
            coVerify(exactly = 1) { repository.getAnimals() }
        }

    @Test
    fun `invoke should emit Loading and Failure when repository throws exception`() =
        runTest(mainDispatcherRule.dispatcher) {
            // Given
            val exception = RuntimeException("An error occurred")
            val expected = DataResult.Failure(exception)
            val expectedEmissionCount = 2
            coEvery { repository.getAnimals() } throws exception

            // When
            val result = subject.invoke().toList()

            // Then
            assertEquals(expectedEmissionCount, result.size)
            assertEquals(expectedLoading, result.first())
            assertEquals(expected, result.last())
            coVerify(exactly = 1) { repository.getAnimals() }
        }
}
