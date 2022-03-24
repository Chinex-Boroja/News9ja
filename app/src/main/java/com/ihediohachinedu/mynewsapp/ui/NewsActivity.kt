package com.ihediohachinedu.mynewsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ihediohachinedu.mynewsapp.R
import com.ihediohachinedu.mynewsapp.db.ArticleDatabase
import com.ihediohachinedu.mynewsapp.repository.NewsRepository
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {

    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(newsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get((NewsViewModel::class.java))

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.news_nav_graph) as? NavHostFragment
        val navController = navHostFragment?.navController

        if (navController != null) {
            bottomNavigationView.setupWithNavController(navController)
        }
       bottomNavigationView?.setupWithNavController(newsNavHostFragment.findNavController())
//        val navHostFragment = supportFragmentManager
//            .findFragmentById(R.id.news_nav_graph) as NavHostFragment
//        val navController = navHostFragment.navController
//
//        bottomNavigationView.setupWithNavController(navController)


//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.news_nav_graph) as NavHostFragment
//        val navController = navHostFragment.navController
    }
}