package com.naxtylab.dagger.screens.main

import com.naxtylab.easy.ui.BasePresenter
import com.naxtylab.dagger.repos.SettingsRepo

class MainPresenterImpl(
        ui: MainContract.MainActivity,
        val settingsRepo: SettingsRepo) :
        MainContract.MainPresenter,
        BasePresenter<MainContract.MainActivity, MainContract.State>(ui) {

    override fun start() {
        //TODO: Do smth.
    }

    override fun stop() {
        //TODO: Do smth.
    }

    override fun onClickSmth() {
        if(settingsRepo.getFirstStart()) {
            ui.setMainText("first")
        } else {
            ui.setMainText("not first")
        }
    }

    override var state: MainContract.State?
        get() = MainContract.State()
        set(value) {
            //TODO: Init presenter
        }
}