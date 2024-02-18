package com.grifalion.onepiece.core_impl

import android.content.Context
import com.grifalion.onepiece.core.AndroidDependenciesProvider
import dagger.Component

@Component(
    modules = [
        AndroidDependenciesModule::class
    ]
)
interface AndroidDependenciesComponent : AndroidDependenciesProvider {

    companion object {
        fun init(
            context: Context,
        ): AndroidDependenciesProvider {
            return DaggerAndroidDependenciesComponent.builder()
                .androidDependenciesModule(AndroidDependenciesModule(context))
                .build()
        }
    }
}
