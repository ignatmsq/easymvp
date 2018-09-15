package com.naxtylab.dagger.screens.main

import com.naxtylab.easy.ui.Contract

interface MainContract {
    interface MainActivity : Contract.Ui {
        fun setMainText(text: String)
    }

    interface MainPresenter : Contract.Presenter<State, Params> {
        fun onClickSmth()
    }

    class State : Contract.State

    class Params : Contract.Params
}