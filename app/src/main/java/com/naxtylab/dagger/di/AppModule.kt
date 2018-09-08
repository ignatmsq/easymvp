package com.naxtylab.dagger.di

import android.content.Context
import com.naxtylab.dagger.repos.SettingsRepo
import com.naxtylab.dagger.repos.SettingsRepoImpl
import com.naxtylab.dagger.repos.StubSettingsRepoImpl
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class AppModule {

    @Provides
    @Named("settings repo")
    fun provideSettingsRepo(context: Context): SettingsRepo {
        return SettingsRepoImpl(context)
    }

    @Provides
    @Named("stub settings repo")
    fun provideStubSettingsRepo(context: Context): SettingsRepo {
        return StubSettingsRepoImpl(context)
    }
}