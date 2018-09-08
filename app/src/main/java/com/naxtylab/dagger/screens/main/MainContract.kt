package com.naxtylab.dagger.screens.main

import com.naxtylab.easy.ui.Contract

interface MainContract {
    interface MainActivity : Contract.Ui {
        fun setMainText(text: String)
    }

    interface MainPresenter : Contract.Presenter<State> {
        fun onClickSmth()
    }

    class State : Contract.State
}