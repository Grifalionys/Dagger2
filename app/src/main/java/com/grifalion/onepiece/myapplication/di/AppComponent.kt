package com.grifalion.onepiece.myapplication.di

import android.app.Application
import android.content.Context
import com.grifalion.onepiece.core.AndroidDependenciesProvider
import com.grifalion.onepiece.core.DependenciesProvider
import com.grifalion.onepiece.core_impl.AndroidDependenciesComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        NavigatorBinds::class
    ],
    dependencies = [
        AndroidDependenciesProvider::class
    ]
)
interface AppComponent : DependenciesProvider {

    companion object {
        fun init(context: Context): AppComponent {
            val androidDependenciesProvider = AndroidDependenciesComponent.init(context)
            return DaggerAppComponent.factory()
                .create(androidDependenciesProvider)
        }
    }

    @Component.Factory
    interface AppComponentFactory {
        fun create(androidDependenciesProvider: AndroidDependenciesProvider): AppComponent
    }

    fun inject(app: Application)
}