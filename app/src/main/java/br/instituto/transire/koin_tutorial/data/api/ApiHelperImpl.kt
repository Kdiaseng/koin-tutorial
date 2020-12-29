package br.instituto.transire.koin_tutorial.data.api

import br.instituto.transire.koin_tutorial.data.model.User
import retrofit2.Response

class ApiHelperImpl(private val apiService: ApiService): ApiHelper {
    override suspend fun getUsers() = apiService.getUsers()
}