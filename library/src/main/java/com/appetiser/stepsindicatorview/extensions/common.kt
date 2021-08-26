package com.appetiser.stepsindicatorview.extensions

import android.content.Context

fun Int.toPx(context: Context): Int = (this * context.resources.displayMetrics.density).toInt()