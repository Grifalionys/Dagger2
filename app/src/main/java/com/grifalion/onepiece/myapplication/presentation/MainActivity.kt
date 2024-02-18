package com.grifalion.onepiece.myapplication.presentation

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.grifalion.onepiece.myapplication.R
import com.grifalion.onepiece.myapplication.app.MainApp
import com.grifalion.onepiece.myapplication.di.MainActivityComponent
import com.grifalion.onepiece.start_page_api.StartNavigator
import com.grifalion.onepiece.start_page_impl.utils.LocalHelper
import javax.inject.Inject

class MainActivity: AppCompatActivity() {

    @Inject
    lateinit var startNavigator: StartNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        MainActivityComponent.init(
            (application as MainApp).getDependenciesProvider()
        ).inject(this)

        if (savedInstanceState == null) {
            com.grifalion.onepiece.core_ui.ContainerId.setContainerId(R.id.fragment_container)
            startNavigator.openStartFragment(this)
        }
    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(LocalHelper.updateResources(newBase))
    }
}

