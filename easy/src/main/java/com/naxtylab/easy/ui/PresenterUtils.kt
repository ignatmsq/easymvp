package com.naxtylab.easy.ui

import android.os.Bundle

internal fun <TYPE> Bundle?.extract(key: String) = this?.getSerializable(key)
        ?.let { serializable -> serializable as TYPE }