package com.izzed.ndelokmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.izzed.ndelokmovie.adapters.CardViewAdapter
import com.izzed.ndelokmovie.adapters.TabViewAdapter
import com.izzed.ndelokmovie.data.Movie
import com.izzed.ndelokmovie.data.MoviesData

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager
    private lateinit var rvMovies: RecyclerView
    private var list: ArrayList<Movie> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        rvMovies = findViewById(R.id.rv_Movies)
        rvMovies.setHasFixedSize(true)

        tabLayout.addTab(tabLayout.newTab().setText("Movie"))
        tabLayout.addTab(tabLayout.newTab().setText("TV Show"))
        tabLayout.addTab(tabLayout.newTab().setText("Profil"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = TabViewAdapter(this, supportFragmentManager, tabLayout.tabCount)
        viewPager.adapter = adapter

        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}

        })

        list.addAll(MoviesData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvMovies.layoutManager = LinearLayoutManager(this)
        val cardViewMovieAdapter = CardViewAdapter(list)
        rvMovies.adapter = cardViewMovieAdapter
    }
}