package com.grifalion.onepiece.start_page_impl.di

import com.grifalion.onepiece.core.qualifiers.NavigatorsQualifier
import com.grifalion.onepiece.start_page_api.StartNavigator
import com.grifalion.onepiece.start_page_impl.navigator.StartPageNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
interface StartPageModule {

        @Binds
        @IntoMap
        @NavigatorsQualifier
        @ClassKey(StartNavigator::class)
        fun bindNavigator(mediator: StartPageNavigatorImpl): Any

}