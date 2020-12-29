package br.instituto.transire.koin_tutorial.data.repository

import br.instituto.transire.koin_tutorial.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}