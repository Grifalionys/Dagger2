package com.grifalion.onepiece.authorization_api.api

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

interface AuthorizationNavigator {

    fun openAuthorizationLoginFragment(fragmentActivity: FragmentActivity,fragment: Fragment, id: Int)
}