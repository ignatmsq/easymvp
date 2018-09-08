package com.naxtylab.easy.di

import android.content.Context
import com.naxtylab.easy.ui.Contract
import dagger.Module
import dagger.Provides

@Module
abstract class BaseModeule<V : Contract.Ui>(val view: V, val context: Context) {

    @Provides
    fun provideView(): V = view

    @Provides
    fun provideContext(): Context = context.applicationContext
}