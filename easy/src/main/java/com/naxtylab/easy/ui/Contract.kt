package com.naxtylab.easy.ui

import java.io.Serializable

interface Contract {
    interface Presenter<STATE : State, PARAMS : Params> {
        fun start()
        fun stop()
        var state: STATE?
        var params: PARAMS?
    }

    interface Ui

    interface State : Serializable

    interface Params : Serializable
}