package com.naxtylab.dagger.repos

import android.content.Context
import android.content.Context.MODE_PRIVATE

class SettingsRepoImpl(context:Context) : SettingsRepo {
    companion object {
        private val PREFS_NAME = "settings"
        private val FIRST_START_KEY = "first_start"
    }

    private val prefs = context.getSharedPreferences(PREFS_NAME, MODE_PRIVATE)

    override fun getFirstStart() =
            prefs.getBoolean(FIRST_START_KEY, true)

    override fun setFirstStart(firstStart: Boolean) {
        prefs.edit().apply{
            putBoolean(FIRST_START_KEY, firstStart)
            commit()
        }
    }
}