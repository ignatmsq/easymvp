package com.naxtylab.easy.di

import android.content.Context
import com.naxtylab.easy.ui.Contract
import dagger.Module
import dagger.Provides

@Module
abstract class BaseModeule<UI : Contract.Ui>(val ui: UI, val context: Context) {

    @Provides
    fun provideView(): UI = ui

    @Provides
    fun provideContext(): Context = context.applicationContext
}