package com.grifalion.onepiece.myapplication.di

import com.grifalion.onepiece.start_page_impl.di.StartPageModule
import dagger.Module

@Module(includes = [
    StartPageModule::class,
])
interface NavigatorBinds