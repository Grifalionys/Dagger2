package com.grifalion.onepiece.authorization_impl.navigation

import androidx.fragment.app.Fragment
import com.grifalion.onepiece.authorization_api.api.StarterAuthorization
import com.grifalion.onepiece.authorization_impl.presentation.fragments.AuthorizationFragment
import javax.inject.Inject

class StarterAuthorizationImpl @Inject constructor(): StarterAuthorization {
    override fun invoke(): Fragment {
        return AuthorizationFragment()
    }
}