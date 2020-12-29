package br.instituto.transire.koin_tutorial.data.api

import br.instituto.transire.koin_tutorial.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}