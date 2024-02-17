package com.grifalion.onepiece.myapplication.di

import com.grifalion.onepiece.authorization_impl.di.StarterModule
import dagger.Module

@Module(
    includes = [
        StarterModule::class
    ]
)
class ScreenBindingModule {

}