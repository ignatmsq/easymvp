package com.naxtylab.dagger.screens.main

import android.os.Bundle
import android.util.Log
import com.naxtylab.easy.ui.BaseActivity
import com.naxtylab.dagger.screens.main.di.DaggerMainComponent
import com.naxtylab.dagger.screens.main.di.MainComponent
import com.naxtylab.dagger.screens.main.di.MainModule


// https://android.jlelse.eu/mvp-dagger-2-rx-clean-modern-android-app-code-74f63c9a6f2f
// https://medium.com/@Zhuinden/that-missing-guide-how-to-use-dagger2-ef116fbea97

//   - Simplify
//   - Interactors

class MainActivityImpl :
        MainContract.MainActivity,
        BaseActivity<MainContract.MainActivity, MainComponent, MainContract.MainPresenter, MainContract.State, MainContract.Params>() {

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