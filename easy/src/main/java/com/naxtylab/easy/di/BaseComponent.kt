package com.naxtylab.easy.di

import com.naxtylab.easy.ui.BaseActivity
import com.naxtylab.easy.ui.Contract

interface BaseComponent<
        PRESENTER : Contract.Presenter<STATE, PARAMS>,
        COMPONENT : BaseComponent<PRESENTER, COMPONENT, STATE, PARAMS>,
        STATE : Contract.State,
        PARAMS : Contract.Params> {
    fun inject(ui: BaseActivity<PRESENTER, COMPONENT, STATE, PARAMS>)
}