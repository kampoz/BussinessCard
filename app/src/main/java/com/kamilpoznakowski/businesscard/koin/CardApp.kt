package com.kamilpoznakowski.businesscard.koin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CardApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@CardApp)
            modules(listOf(appModule))
        }
    }
}