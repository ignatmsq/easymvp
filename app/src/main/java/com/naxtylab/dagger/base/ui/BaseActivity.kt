package com.naxtylab.dagger.base.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.naxtylab.dagger.base.di.BaseComponent
import java.io.Serializable
import javax.inject.Inject

abstract class BaseActivity<U, C : BaseComponent<U, C, P, S>, P : Contract.Presenter<S>, S : Serializable> : AppCompatActivity() {

    companion object {
        private const val STATE_KEY = "state"
    }

    @Inject
    protected lateinit var presenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getComponent().inject(this)
        presenter.state = savedInstanceState.extractState()
    }

    override fun onStart() {
        super.onStart()
        presenter.start()
    }

    override fun onStop() {
        super.onStop()
        presenter.stop()
    }

    abstract fun getComponent(): C

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        val s = presenter.state
        outState?.putSerializable(STATE_KEY, s)
    }

    fun Bundle?.extractState() = this?.getSerializable(STATE_KEY)
            ?.let { serializable -> serializable as S }
}