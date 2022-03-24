package com.ihediohachinedu.mynewsapp.repository

import com.ihediohachinedu.mynewsapp.api.RetrofitInstance
import com.ihediohachinedu.mynewsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
){
    //Call from our retrofit instance and pass the data
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber )
}