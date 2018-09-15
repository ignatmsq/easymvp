package com.naxtylab.dagger.screens.main

import android.os.Bundle
import android.util.Log
import com.naxtylab.easy.ui.BaseActivity
import com.naxtylab.dagger.screens.main.di.DaggerMainComponent
import com.naxtylab.dagger.screens.main.di.MainComponent
import com.naxtylab.dagger.screens.main.di.MainModule

class MainActivityImpl :
        MainContract.MainActivity,
        BaseActivity<MainContract.MainPresenter, MainComponent, MainContract.State, MainContract.Params>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getComponent().inject(this)
    }

    override fun onStart() {
        super.onStart()
        presenter.onClickSmth()
    }

    override fun setMainText(text: String) {
        Log.i(">>>", "setMainText($text)")
    }

    override fun getComponent(): MainComponent = DaggerMainComponent
            .builder()
            .mainModule(MainModule(this, applicationContext))
            .build()
}