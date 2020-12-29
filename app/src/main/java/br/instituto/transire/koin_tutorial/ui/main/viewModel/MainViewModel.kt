package br.instituto.transire.koin_tutorial.ui.main.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.instituto.transire.koin_tutorial.data.model.User
import br.instituto.transire.koin_tutorial.data.repository.MainRepository
import br.instituto.transire.koin_tutorial.utils.NetworkHelper
import br.instituto.transire.koin_tutorial.utils.Resource
import kotlinx.coroutines.launch

class MainViewModel(
    private val mainRepository: MainRepository,
    private val netWorkHelper: NetworkHelper
) : ViewModel() {
    private val _users = MutableLiveData<Resource<List<User>>>()
    val users: LiveData<Resource<List<User>>>
        get() = _users

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            _users.value = Resource.loading(null)
            if (netWorkHelper.isNetworkConnected()) {
                mainRepository.getUsers().let {
                    if (it.isSuccessful) {
                        _users.value = Resource.success(it.body())
                    } else _users.value = Resource.error(it.errorBody().toString(), null)
                }
            } else _users.value = Resource.error("No internet connection", null)
        }
    }
}