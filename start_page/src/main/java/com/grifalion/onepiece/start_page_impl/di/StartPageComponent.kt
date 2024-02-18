package com.grifalion.onepiece.start_page_impl.di

import com.grifalion.onepiece.core.DependenciesProvider
import com.grifalion.onepiece.start_page_impl.presentation.fragments.MainFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [DependenciesProvider::class]
)

interface StartPageComponent {

    companion object {

        fun init(
            dependenciesProvider: DependenciesProvider
        ): StartPageComponent {
            return DaggerStartPageComponent.factory()
                .create(dependenciesProvider)
        }
    }

    @Component.Factory
    interface Factory {

        fun create(
            dependenciesProvider: DependenciesProvider
        ): StartPageComponent
    }
    fun inject(mainFragment: MainFragment)
}