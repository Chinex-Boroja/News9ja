package com.ihediohachinedu.mynewsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ihediohachinedu.mynewsapp.R
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

//        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        val navHostFragment = supportFragmentManager
//            .findFragmentById(R.id.news_nav_graph) as? NavHostFragment
//        val navController = navHostFragment?.navController
//
//        if (navController != null) {
//            bottomNavigationView.setupWithNavController(navController)
//        }
       bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
//        val navHostFragment = supportFragmentManager
//            .findFragmentById(R.id.news_nav_graph) as NavHostFragment
//        val navController = navHostFragment.navController
//
//        bottomNavigationView.setupWithNavController(navController)
    }
}