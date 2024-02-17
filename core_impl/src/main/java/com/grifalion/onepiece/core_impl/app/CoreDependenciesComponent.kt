package com.grifalion.onepiece.core_impl.app

import android.app.Application
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidDependenciesModule::class
    ]
)
interface CoreDependenciesComponent: CoreDependenciesProvider {
    fun inject(application: Application)

    companion object {
        fun create(app: Application): CoreDependenciesProvider {

            return DaggerCoreDependenciesComponent.builder()
                .androidDependenciesModule(AndroidDependenciesModule(app))
                .build()
        }
    }
}

