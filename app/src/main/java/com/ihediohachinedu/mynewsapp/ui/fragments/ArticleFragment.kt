package com.ihediohachinedu.mynewsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.ihediohachinedu.mynewsapp.R
import com.ihediohachinedu.mynewsapp.ui.NewsActivity
import com.ihediohachinedu.mynewsapp.ui.NewsViewModel

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as NewsActivity).viewModel

    }
}