package com.izzed.ndelokmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.izzed.ndelokmovie.fragments.MovieFragment
import com.izzed.ndelokmovie.fragments.TvShowFragment
import com.izzed.ndelokmovie.R
import com.izzed.ndelokmovie.fragments.ProfileFragment

class MainActivity : AppCompatActivity() {

    private val movieFragment = MovieFragment()
    private val tvShowFragment = TvShowFragment()
    private val profileFragment = ProfileFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(MovieFragment())

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.ic_movie -> replaceFragment(movieFragment)
                R.id.ic_tvShow -> replaceFragment(tvShowFragment)
                R.id.ic_profile -> replaceFragment(profileFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {

        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_layout, fragment)
            transaction.commit()
        }
    }

}