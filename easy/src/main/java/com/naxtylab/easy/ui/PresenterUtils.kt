package com.naxtylab.easy.ui

import android.os.Bundle

internal const val STATE_KEY = "state"
internal const val PARAMS_KEY = "params"

internal fun <TYPE> Bundle?.extract(key: String) =
        this?.getSerializable(key)
                ?.let { serializable -> serializable as TYPE }