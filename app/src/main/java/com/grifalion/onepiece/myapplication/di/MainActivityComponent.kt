package com.grifalion.onepiece.myapplication.di

import com.grifalion.onepiece.core.DependenciesProvider
import com.grifalion.onepiece.core.getNavigator
import com.grifalion.onepiece.myapplication.presentation.MainActivity
import com.grifalion.onepiece.start_page_api.StartNavigator
import dagger.Component

@Component(
    dependencies = [
        DependenciesProvider::class,
        StartNavigator::class
    ]
)
interface MainActivityComponent {

    companion object {

        fun init(
            dependenciesProvider: DependenciesProvider
        ): MainActivityComponent {
            return DaggerMainActivityComponent.builder()
                .dependenciesProvider(dependenciesProvider)
                .startNavigator(dependenciesProvider.getNavigator())
                .build()
        }
    }

    fun inject(mainActivity: MainActivity)

}