package ru.surftudio.daggerpractice.di.module

import android.app.Application
import dagger.Module
import dagger.Provides
import ru.surftudio.daggerpractice.AppApplication
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: AppApplication) {

    @Provides
    @Singleton
    fun provideApplication(): Application {
        return application
    }
}