package com.grifalion.onepiece.core

import com.grifalion.onepiece.core.qualifiers.NavigatorsQualifier
import javax.inject.Provider

typealias NavigatorsMap = Map<Class<*>, @JvmSuppressWildcards Provider<Any>>

interface NavigatorsProvider {

    @NavigatorsQualifier
    fun provideNavigatorsMap(): NavigatorsMap
}

inline fun <reified T : Any> NavigatorsProvider.getNavigator(): T {
    return provideNavigatorsMap().getNavigator()
}

inline fun <reified T : Any> NavigatorsMap.getNavigator(): T {
    return getValue(T::class.java).get() as T
}