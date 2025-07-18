package com.felippeneves.kotlin_compose_mvi_animals_app.core.extensions

import android.content.res.Configuration

fun Configuration.estimateSkeletonItemCount(itemHeightDp: Int): Int {
    val screenHeight = this.screenHeightDp
    return (screenHeight / itemHeightDp).coerceAtLeast(3)
}
