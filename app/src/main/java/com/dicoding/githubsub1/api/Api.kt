package com.dicoding.githubsub1.api

import com.dicoding.githubsub1.data.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")

    fun getSearchUsers(
        @Query("q") query: String
    ): retrofit2.Call<UserResponse>
}