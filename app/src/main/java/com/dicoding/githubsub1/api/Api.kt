package com.dicoding.githubsub1.api

import com.dicoding.githubsub1.data.model.DetailUserResponse
import com.dicoding.githubsub1.data.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")

    fun getSearchUsers(
        @Query("q") query: String
    ): retrofit2.Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String
    ): retrofit2.Call<DetailUserResponse>

    @GET ("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): retrofit2.Call<ArrayList<DetailUserResponse>>

    @GET ("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): retrofit2.Call<ArrayList<DetailUserResponse>>
}