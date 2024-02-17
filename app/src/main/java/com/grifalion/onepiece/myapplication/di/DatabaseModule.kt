package com.grifalion.onepiece.myapplication.di

import com.grifalion.onepiece.myapplication.data.NetworkHelper
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {

    @Provides
    fun provideNetworkHelper(): NetworkHelper {
        return NetworkHelper()
    }
}