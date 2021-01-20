package id.ac.amikom.github.githubuserapi.api

import id.ac.amikom.github.githubuserapi.data.model.DetailUserResponse
import id.ac.amikom.github.githubuserapi.data.model.User
import retrofit2.Call
import id.ac.amikom.github.githubuserapi.data.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 7ddfead0ac256224eea749e0c520c826d19818c5")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("user/{username}")
    @Headers("Authorization: token 7ddfead0ac256224eea749e0c520c826d19818c5")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 7ddfead0ac256224eea749e0c520c826d19818c5")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 7ddfead0ac256224eea749e0c520c826d19818c5")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}