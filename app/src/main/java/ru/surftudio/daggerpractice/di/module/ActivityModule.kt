package ru.surftudio.daggerpractice.di.module

import android.app.Activity
import dagger.Module
import dagger.Provides
import ru.surftudio.daggerpractice.AppApplication
import ru.surftudio.daggerpractice.di.scope.PerActivity
import ru.surftudio.daggerpractice.ui.Presenter
import ru.surftudio.daggerpractice.ui.PresenterImpl

@Module
class ActivityModule(private var activity: Activity) {

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    @PerActivity
    fun providePresenter(application: AppApplication): Presenter {
        return PresenterImpl(application)
    }
}