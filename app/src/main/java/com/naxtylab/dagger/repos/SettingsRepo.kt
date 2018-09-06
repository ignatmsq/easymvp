package com.naxtylab.dagger.repos

interface SettingsRepo {
    fun getFirstStart():Boolean
    fun setFirstStart(firstStart: Boolean)
}