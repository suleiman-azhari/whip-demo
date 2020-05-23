package com.demo.whip.ui.main

import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.demo.whip.R
import com.demo.whip.ui.main.dashboard.DashboardFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(
                R.id.fragment_container,
                DashboardFragment.newInstance(),
                DashboardFragment::class.simpleName
            )
            .commit()

        bottom_navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

    private val onNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.dashboard -> {
                    Toast.makeText(this, "DashboardFragment", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.jobs -> {
                    Toast.makeText(this, "Jobs Fragment NOT implemented", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.inbox -> {
                    Toast.makeText(this, "Inbox Fragment NOT implemented", Toast.LENGTH_SHORT)
                        .show()
                    true
                }
                R.id.more -> {
                    Toast.makeText(this, "More Fragment NOT implemented", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

    private fun setContent(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content, fragment, fragment.javaClass.simpleName)
            .commit()
    }
}

