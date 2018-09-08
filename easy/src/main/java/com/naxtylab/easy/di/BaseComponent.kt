package com.naxtylab.easy.di

import com.naxtylab.easy.ui.BaseActivity
import com.naxtylab.easy.ui.Contract
import java.io.Serializable

interface BaseComponent<U, C : BaseComponent<U, C, P, S>, P : Contract.Presenter<S>, S : Serializable> {
    fun inject(ui: BaseActivity<U, C, P, S>)
}