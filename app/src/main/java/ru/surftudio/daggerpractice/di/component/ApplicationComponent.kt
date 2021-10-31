package ru.surftudio.daggerpractice.di.component

import dagger.Component
import ru.surftudio.daggerpractice.AppApplication
import ru.surftudio.daggerpractice.di.module.ApplicationModule

@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(application: AppApplication)
}