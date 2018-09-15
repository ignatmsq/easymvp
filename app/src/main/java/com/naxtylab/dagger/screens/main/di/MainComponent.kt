package com.naxtylab.dagger.screens.main.di

import com.naxtylab.easy.di.BaseComponent
import com.naxtylab.easy.ui.BaseActivity
import com.naxtylab.dagger.di.AppModule
import com.naxtylab.dagger.screens.main.MainContract.*
import dagger.Component


@Component(modules = arrayOf(MainModule::class, AppModule::class))
interface MainComponent : BaseComponent<MainActivity, MainComponent, MainPresenter, State, Params> {
    override fun inject(ui: BaseActivity<MainActivity, MainComponent, MainPresenter, State, Params>)
}