package com.naxtylab.dagger.repos

import android.content.Context

class StubSettingsRepoImpl(val context:Context) : SettingsRepo {
    override fun getFirstStart() = false
    override fun setFirstStart(firstStart: Boolean) { }
}