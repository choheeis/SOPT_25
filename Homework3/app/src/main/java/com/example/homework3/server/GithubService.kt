package com.example.homework3.server

import com.example.homework3.data.GitrepositoryItemData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("/users/{username}/repos")
    fun getRepoList(@Path("username") username: String): Call<List<GitrepositoryItemData>>
}



