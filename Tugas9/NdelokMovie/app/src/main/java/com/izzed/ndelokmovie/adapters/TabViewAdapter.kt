package com.izzed.ndelokmovie.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.izzed.ndelokmovie.fragments.MovieFragment
import com.izzed.ndelokmovie.fragments.ProfilFragment
import com.izzed.ndelokmovie.fragments.TVShowFragment

internal class TabViewAdapter(var context: Context, fm: FragmentManager, var totalTabs: Int): FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> {
                MovieFragment()
            }
            1 -> {
                TVShowFragment()
            }
            2 -> {
                ProfilFragment()
            }
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}