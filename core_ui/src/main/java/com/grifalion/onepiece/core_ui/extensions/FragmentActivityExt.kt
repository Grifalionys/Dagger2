package com.grifalion.onepiece.start_page_impl.presentation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.grifalion.onepiece.core_ui.ContainerId
import kotlin.reflect.KClass

inline fun <reified T : Fragment> FragmentActivity.replaceFragment(
    addToBackStack: Boolean,
    fragment: T
) {
    fragment.openFragment(supportFragmentManager, fragment.javaClass.kotlin.getTag(), addToBackStack)
}

fun KClass<out Fragment>.getTag(): String = this.java.name

fun Fragment.openFragment(
    fragmentManager: FragmentManager,
    tag: String,
    addToBackStack: Boolean
) {
    fragmentManager.beginTransaction().apply {
        if (addToBackStack) addToBackStack(tag)
        replace(com.grifalion.onepiece.core_ui.ContainerId.containerId, this@openFragment, tag)
        commit()
    }
}