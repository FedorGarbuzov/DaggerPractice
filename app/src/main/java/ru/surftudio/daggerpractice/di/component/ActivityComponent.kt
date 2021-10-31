package ru.surftudio.daggerpractice.di.component

import dagger.Component
import ru.surftudio.daggerpractice.MainActivity
import ru.surftudio.daggerpractice.di.module.ActivityModule

@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent: ApplicationComponent {

    fun inject(mainActivity: MainActivity)
}