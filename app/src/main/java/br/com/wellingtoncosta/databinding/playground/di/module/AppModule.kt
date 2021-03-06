package br.com.wellingtoncosta.databinding.playground.di.module

import android.content.Context
import br.com.wellingtoncosta.databinding.playground.App
import br.com.wellingtoncosta.databinding.playground.di.module.ui.ViewModeiModule
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author WellingtonCosta on 18/07/18
 */
@Module(includes = [ViewModeiModule::class])
class AppModule {

    @Provides
    @Singleton
    fun provideContext(app: App): Context = app.applicationContext

}