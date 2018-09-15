package com.naxtylab.easy.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.naxtylab.easy.di.BaseComponent
import javax.inject.Inject

abstract class BaseActivity<
        PRESENTER : Contract.Presenter<STATE, PARAMS>,
        COMPONENT : BaseComponent<PRESENTER, COMPONENT, STATE, PARAMS>,
        STATE : Contract.State,
        PARAMS : Contract.Params>
    : Contract.Ui, AppCompatActivity() {

    companion object {
        private const val STATE_KEY = "state"
        private const val PARAMS_KEY = "params"
    }

    @Inject
    protected lateinit var presenter: PRESENTER

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getComponent().inject(this)
        presenter.state = savedInstanceState.extract<STATE>(STATE_KEY)
        presenter.params = intent.extras.extract<PARAMS>(PARAMS_KEY)
    }

    override fun onStart() {
        super.onStart()
        presenter.start()
    }

    override fun onStop() {
        super.onStop()
        presenter.stop()
    }

    abstract fun getComponent(): COMPONENT

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        val s = presenter.state
        outState?.putSerializable(STATE_KEY, s)
    }

    private fun <TYPE> Bundle?.extract(key: String) = this?.getSerializable(key)
            ?.let { serializable -> serializable as TYPE }
}