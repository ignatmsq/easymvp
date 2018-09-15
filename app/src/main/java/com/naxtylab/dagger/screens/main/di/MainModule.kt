package com.naxtylab.dagger.screens.main.di

import android.content.Context
import com.naxtylab.easy.di.BaseModeule
import com.naxtylab.dagger.screens.main.MainPresenterImpl
import com.naxtylab.dagger.repos.SettingsRepo
import com.naxtylab.dagger.screens.main.MainContract.*
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class MainModule(mainActivity: MainActivity, appContext: Context) : BaseModeule<MainActivity>(mainActivity, appContext) {
    @Provides
    fun providePresenter(mainActivity: MainActivity, @Named("settings repo") settingsRepo: SettingsRepo): MainPresenter =
            MainPresenterImpl(mainActivity, settingsRepo)
}
