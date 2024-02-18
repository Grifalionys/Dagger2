package com.grifalion.onepiece.myapplication.app

import android.app.Application
import com.grifalion.onepiece.core.DependenciesProvider
import com.grifalion.onepiece.myapplication.di.AppComponent

class MainApp: Application(), App {

    private var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()
        getAppComponent().inject(this)
    }

    override fun getDependenciesProvider(): DependenciesProvider {
        return getAppComponent()
    }

    override fun cleanComponent() {
        appComponent = null
    }

    private fun getAppComponent(): AppComponent {
        if (appComponent == null) {
            appComponent = AppComponent.init(applicationContext)
        }
        return appComponent!!
    }


}

