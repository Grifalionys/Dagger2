package com.grifalion.onepiece.authorization_impl.di

import com.grifalion.onepiece.authorization_impl.presentation.fragments.AuthorizationFragment
import com.grifalion.onepiece.core_impl.navigation.ScreensMap
import com.grifalion.onepiece.core_impl.navigation.ScreensQualifier
import com.grifalion.onepiece.core_impl.navigation.getScreen
import dagger.Module
import dagger.Provides

@Module
class NavigateAuthorizationModule {
    @Provides
    fun provideMeinFeatureFragment(
        @ScreensQualifier screensMap: ScreensMap
    ): AuthorizationFragment {
        return screensMap.getScreen()
    }
}