package com.naxtylab.easy.di

import com.naxtylab.easy.ui.BaseActivity
import com.naxtylab.easy.ui.Contract

interface BaseComponent<
        UI,
        COMPONENT : BaseComponent<UI, COMPONENT, PRESENTER, STATE, PARAMS>,
        PRESENTER : Contract.Presenter<STATE, PARAMS>,
        STATE : Contract.State,
        PARAMS : Contract.Params> {
    fun inject(ui: BaseActivity<UI, COMPONENT, PRESENTER, STATE, PARAMS>)
}