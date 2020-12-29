package br.instituto.transire.koin_tutorial

import android.app.Application
import br.instituto.transire.koin_tutorial.di.module.appModule
import br.instituto.transire.koin_tutorial.di.module.repoModule
import br.instituto.transire.koin_tutorial.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}