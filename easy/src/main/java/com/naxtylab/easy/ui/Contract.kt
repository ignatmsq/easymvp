package com.naxtylab.easy.ui

import java.io.Serializable

interface Contract {
    interface Presenter<S> {
        fun start()
        fun stop()
        var state: S?
    }

    interface Ui

    interface State : Serializable
}