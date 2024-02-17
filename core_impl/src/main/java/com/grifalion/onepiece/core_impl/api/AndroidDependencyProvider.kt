package com.grifalion.onepiece.core_impl.api

import android.app.Application
import android.content.Context

interface AndroidDependencyProvider {
    fun provideApplication(): Application
    fun provideContext(): Context
}