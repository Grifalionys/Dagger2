package com.grifalion.onepiece.myapplication.app

import android.app.Application
import com.grifalion.onepiece.core_impl.app.ApplicationProvider
import com.grifalion.onepiece.myapplication.di.AppComponent

class App: Application(), AppInterface {
    private lateinit var appComponent: ApplicationProvider

    override fun onCreate() {
        super.onCreate()
        appComponent = AppComponent.init(this)
    }

    override fun getApplicationProvider(): ApplicationProvider {
        return appComponent
    }
}

