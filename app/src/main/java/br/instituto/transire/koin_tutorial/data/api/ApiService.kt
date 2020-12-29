package br.instituto.transire.koin_tutorial.data.api

import br.instituto.transire.koin_tutorial.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Response<List<User>>
}