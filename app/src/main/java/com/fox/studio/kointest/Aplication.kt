package com.fox.studio.kointest

import android.app.Application
import com.fox.studio.kointest.module.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyAplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MyAplication)
            modules(appModule)
        }
    }
}