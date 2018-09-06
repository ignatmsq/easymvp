package com.naxtylab.dagger.base.di

import com.naxtylab.dagger.base.ui.BaseActivity
import com.naxtylab.dagger.base.ui.Contract
import java.io.Serializable

interface BaseComponent<U, C : BaseComponent<U, C, P, S>, P : Contract.Presenter<S>, S : Serializable> {
    fun inject(ui: BaseActivity<U, C, P, S>)
}