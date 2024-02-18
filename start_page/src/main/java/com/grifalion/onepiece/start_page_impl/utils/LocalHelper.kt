package com.grifalion.onepiece.start_page_impl.utils

import android.content.Context
import android.content.res.Configuration


object LocalHelper {

    fun updateResources(context: Context): Context? {
        val configuration: Configuration = context.resources.configuration

        return context.createConfigurationContext(configuration)
    }
}