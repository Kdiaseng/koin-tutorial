package br.instituto.transire.koin_tutorial.di.module

import br.instituto.transire.koin_tutorial.ui.main.viewModel.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel {
        MainViewModel(get(), get())
    }
}
