package com.grifalion.onepiece.authorization_impl.di

import com.grifalion.onepiece.authorization_api.api.StarterAuthorization
import com.grifalion.onepiece.authorization_impl.navigation.StarterAuthorizationImpl
import com.grifalion.onepiece.core_impl.navigation.ScreensQualifier
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
interface StarterModule {
    @Binds
    fun bindMainFeatureFragment(authorizationFragment: StarterAuthorizationImpl): StarterAuthorization

    @Binds
    @IntoMap
    @ScreensQualifier
    @ClassKey(StarterAuthorization::class)
    fun bindMainFeatureFragmentToMap(screen: StarterAuthorization): Any
}