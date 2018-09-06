package com.naxtylab.dagger.base.ui

abstract class BasePresenter<U, S>(val ui: U) : Contract.Presenter<S>