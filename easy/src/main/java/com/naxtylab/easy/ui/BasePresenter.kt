package com.naxtylab.easy.ui

abstract class BasePresenter<UI, STATE : Contract.State, PARAMS : Contract.Params>(val ui: UI) : Contract.Presenter<STATE, PARAMS> {
    override var state: STATE? = null
        get() = field
        set(value) { field = value }

    override var params: PARAMS? = null
        get() = field
        set(value) { field = value }
}