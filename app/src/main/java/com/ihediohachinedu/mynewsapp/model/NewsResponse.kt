package com.ihediohachinedu.mynewsapp.model

import com.ihediohachinedu.mynewsapp.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)