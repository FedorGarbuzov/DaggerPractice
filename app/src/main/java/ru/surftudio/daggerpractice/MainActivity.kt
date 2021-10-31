package ru.surftudio.daggerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.surftudio.daggerpractice.di.component.DaggerActivityComponent
import ru.surftudio.daggerpractice.di.module.ActivityModule
import ru.surftudio.daggerpractice.ui.Presenter
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injectDependency()
    }

    private fun injectDependency() {
        val activityComponent = DaggerActivityComponent.builder()
            .activityModule(ActivityModule(this))
            .build()

        activityComponent.inject(this)
    }
}