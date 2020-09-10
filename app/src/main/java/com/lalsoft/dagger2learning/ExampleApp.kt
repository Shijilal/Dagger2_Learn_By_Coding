package com.lalsoft.dagger2learning

import android.app.Application
import com.lalsoft.dagger2learning.dagger.ActivityComponent
import com.lalsoft.dagger2learning.dagger.AppComponent
import com.lalsoft.dagger2learning.dagger.DaggerAppComponent


class ExampleApp : Application() {
    companion object{
        lateinit var exampleApp:ExampleApp
        lateinit var component: AppComponent
    }


    override fun onCreate() {
        exampleApp=this
        super.onCreate()
        component = DaggerAppComponent.create()

    }

}