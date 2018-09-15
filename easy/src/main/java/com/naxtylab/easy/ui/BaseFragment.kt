package com.naxtylab.easy.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import com.naxtylab.easy.di.BaseComponent
import javax.inject.Inject

abstract class BaseFragment<
        PRESENTER : Contract.Presenter<STATE, PARAMS>,
        COMPONENT : BaseComponent<PRESENTER, COMPONENT, STATE, PARAMS>,
        STATE : Contract.State,
        PARAMS : Contract.Params>
    : Contract.Ui, Fragment() {

    @Inject
    protected lateinit var presenter: PRESENTER

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getComponent().inject(this)
        presenter.state = savedInstanceState.extract<STATE>(STATE_KEY)
        presenter.params = arguments.extract<PARAMS>(PARAMS_KEY)
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

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putSerializable(STATE_KEY, presenter.state)
    }
}