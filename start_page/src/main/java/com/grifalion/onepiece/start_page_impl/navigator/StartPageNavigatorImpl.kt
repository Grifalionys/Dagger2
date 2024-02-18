package com.grifalion.onepiece.start_page_impl.navigator

import androidx.fragment.app.FragmentActivity
import com.grifalion.onepiece.start_page_api.StartNavigator
import com.grifalion.onepiece.start_page_impl.presentation.fragments.MainFragment
import com.grifalion.onepiece.start_page_impl.presentation.replaceFragment
import javax.inject.Inject

class StartPageNavigatorImpl
@Inject constructor(): StartNavigator{
    override fun openStartFragment(fragmentActivity: FragmentActivity) {
        fragmentActivity.replaceFragment(
            addToBackStack = false,
            MainFragment()
        )
    }
}