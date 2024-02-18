package com.grifalion.onepiece.myapplication.di

import com.grifalion.onepiece.core.NavigatorsMap
import com.grifalion.onepiece.core.getNavigator
import com.grifalion.onepiece.core.qualifiers.NavigatorsQualifier
import com.grifalion.onepiece.start_page_api.StartNavigator
import dagger.Module
import dagger.Provides

@Module
object ApplicationModule {
    @Provides
    fun provideWelcomeNavigator(
        @NavigatorsQualifier navigatorMap: NavigatorsMap,
    ): StartNavigator {
        return navigatorMap.getNavigator()
    }
}