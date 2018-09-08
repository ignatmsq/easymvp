package com.naxtylab.easy.ui

abstract class BasePresenter<U, S>(val ui: U) : Contract.Presenter<S>