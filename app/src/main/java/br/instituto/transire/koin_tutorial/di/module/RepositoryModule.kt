package br.instituto.transire.koin_tutorial.di.module

import br.instituto.transire.koin_tutorial.data.repository.MainRepository
import org.koin.dsl.module


val repoModule = module {
    single {
        MainRepository(get())
    }
}
