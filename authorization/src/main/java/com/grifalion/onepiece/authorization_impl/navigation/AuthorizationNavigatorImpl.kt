package com.grifalion.onepiece.authorization_impl.navigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.grifalion.onepiece.authorization_api.api.AuthorizationNavigator
import com.grifalion.onepiece.authorization_impl.R
import com.grifalion.onepiece.authorization_impl.presentation.fragments.AuthorizationFragment
import javax.inject.Inject

class AuthorizationNavigatorImpl
@Inject constructor() : AuthorizationNavigator {

    override fun openAuthorizationLoginFragment(fragmentActivity: FragmentActivity,fragment: Fragment, id: Int) {
        fragmentActivity
            .supportFragmentManager
            .beginTransaction()
            .replace(id, fragment)
            .addToBackStack(null)
            .commit()
    }

}