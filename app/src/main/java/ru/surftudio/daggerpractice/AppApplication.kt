package ru.surftudio.daggerpractice

import android.app.Application
import ru.surftudio.daggerpractice.di.component.ApplicationComponent
import ru.surftudio.daggerpractice.di.component.DaggerApplicationComponent
import ru.surftudio.daggerpractice.di.module.ApplicationModule

class AppApplication : Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        instance = this
        setup()
    }

    fun setup() {
        component = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this)).build()
        component.inject(this)
    }

    fun getApplicationComponent(): ApplicationComponent {
        return component
    }

    companion object {
        lateinit var instance: AppApplication private set
    }
}