package com.grifalion.onepiece.myapplication.app

import com.grifalion.onepiece.core.DependenciesProvider

interface App {
    fun getDependenciesProvider(): DependenciesProvider
    fun cleanComponent()
}