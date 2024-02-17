package com.grifalion.onepiece.myapplication.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.grifalion.onepiece.authorization_api.api.StarterAuthorization
import com.grifalion.onepiece.myapplication.R
import com.grifalion.onepiece.myapplication.app.App
import com.grifalion.onepiece.myapplication.presentation.fragments.MainFragment
import javax.inject.Inject

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activity = layoutInflater.inflate(R.layout.main_activity, null)
        setContentView(activity)
        addFragment(MainFragment())
    }

    private fun addFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container,fragment)
            .commit()
    }
}

