package com.felippeneves.kotlin_compose_mvi_animals_app.testutils.extensions

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.advanceUntilIdle

@OptIn(ExperimentalCoroutinesApi::class)
suspend fun <T> TestScope.sendIntentAndAwait(
    channel: Channel<T>,
    intent: T
) {
    channel.send(intent)
    advanceUntilIdle()
}
