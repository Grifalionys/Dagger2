package com.grifalion.onepiece.authorization_impl.di

import com.grifalion.onepiece.authorization_impl.presentation.fragments.AuthorizationFragment
import com.grifalion.onepiece.core_impl.app.ApplicationProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        NavigateAuthorizationModule::class
    ],
    dependencies = [
        ApplicationProvider::class
    ]

)
interface AuthorizationComponent {

    companion object {

        fun init(
            applicationProvider: ApplicationProvider
        ): AuthorizationComponent {
            return DaggerAuthorizationComponent.factory()
                .create(applicationProvider = applicationProvider)
        }
    }

    @Component.Factory
    interface Factory {

        fun create(applicationProvider: ApplicationProvider): AuthorizationComponent
    }

    fun inject(meinFeatureFragment: AuthorizationFragment)
}