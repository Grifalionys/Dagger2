package com.grifalion.onepiece.core

import android.content.Context

interface AndroidDependenciesProvider {

    fun provideContext(): Context

}