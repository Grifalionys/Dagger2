package com.grifalion.onepiece.myapplication.di

import com.grifalion.onepiece.core_impl.app.ApplicationProvider
import com.grifalion.onepiece.core_impl.app.CoreDependenciesComponent
import com.grifalion.onepiece.core_impl.app.CoreDependenciesProvider
import com.grifalion.onepiece.myapplication.app.App
import com.grifalion.onepiece.myapplication.presentation.MainActivity
import com.grifalion.onepiece.myapplication.presentation.fragments.MainFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ScreenBindingModule::class
    ],
    dependencies = [
        CoreDependenciesProvider::class
    ]
)
interface AppComponent : ApplicationProvider {

    @Component.Factory
    interface AppComponentFactory {
        fun create(coreDependenciesProvider: CoreDependenciesProvider): AppComponent
    }

    fun inject(mainFragment: MainFragment)

    companion object {
        fun init(app: App): ApplicationProvider {
            val androidDependenciesProvider = CoreDependenciesComponent.create(app)
            return DaggerAppComponent.factory()
                .create(
                    coreDependenciesProvider = androidDependenciesProvider
                )
        }
    }
}