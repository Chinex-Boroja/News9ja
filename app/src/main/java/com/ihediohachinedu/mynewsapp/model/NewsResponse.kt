package com.ihediohachinedu.mynewsapp.model

import com.google.gson.annotations.SerializedName
import com.ihediohachinedu.mynewsapp.model.Article

data class NewsResponse(
    @SerializedName("articles")
    val articles: MutableList<Article>,
    @SerializedName("status")
    val status: String?,
    @SerializedName("totalResults")
    val totalResults: Int
)