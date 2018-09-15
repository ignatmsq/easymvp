package com.naxtylab.easy.ui

abstract class BasePresenter<UI, STATE : Contract.State, PARAMS: Contract.Params>(val ui: UI) : Contract.Presenter<STATE, PARAMS>