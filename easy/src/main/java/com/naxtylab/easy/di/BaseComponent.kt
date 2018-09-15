package com.naxtylab.easy.di

import com.naxtylab.easy.ui.BaseActivity
import com.naxtylab.easy.ui.Contract

interface BaseComponent<
        UI,
        PRESENTER : Contract.Presenter<STATE, PARAMS>,
        COMPONENT : BaseComponent<UI, PRESENTER, COMPONENT, STATE, PARAMS>,
        STATE : Contract.State,
        PARAMS : Contract.Params> {
    fun inject(ui: BaseActivity<UI, PRESENTER, COMPONENT, STATE, PARAMS>)
}