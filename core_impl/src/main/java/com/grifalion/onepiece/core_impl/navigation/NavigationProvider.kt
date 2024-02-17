package com.grifalion.onepiece.core_impl.navigation

import androidx.fragment.app.Fragment
import javax.inject.Provider

typealias ScreensMap = Map<Class<*>, @JvmSuppressWildcards Provider<Any>>

    interface ScreensMapProvider {

        @ScreensQualifier
        fun provideScreensMap(): ScreensMap
    }

annotation class ScreensQualifier

inline fun <reified T : Fragment> ScreensMap.getScreen(): T {
        return (getValue(T::class.java) as Provider<T>).get()
    }
