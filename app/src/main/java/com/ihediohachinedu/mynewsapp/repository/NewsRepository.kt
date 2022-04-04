package com.ihediohachinedu.mynewsapp.repository

import com.ihediohachinedu.mynewsapp.api.RetrofitInstance
import com.ihediohachinedu.mynewsapp.db.ArticleDatabase
import com.ihediohachinedu.mynewsapp.model.Article

class NewsRepository(
    val db: ArticleDatabase
){
    //Call from our retrofit instance and pass the data
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber )

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}