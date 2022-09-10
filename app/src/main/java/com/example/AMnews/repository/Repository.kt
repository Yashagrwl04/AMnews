package com.example.AMnews.repository

import android.content.Context
import com.example.AMnews.Models.Post
import com.example.AMnews.api.RetrofitInstance
import retrofit2.Response

class Repository(var context: Context) {

    suspend fun getPost(country: String, apiKey: String): Response<Post> {
        return RetrofitInstance.getClient(context).getPost(country, apiKey)
    }

}