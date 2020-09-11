package com.lalsoft.dagger2learning

import android.app.Application
import com.lalsoft.dagger2learning.dagger.AppComponent
import com.lalsoft.dagger2learning.dagger.DaggerAppComponent
import com.lalsoft.dagger2learning.dagger.DriverModule


class ExampleApp : Application() {
    companion object{
        lateinit var exampleApp:ExampleApp
        lateinit var component: AppComponent
    }


    override fun onCreate() {
        exampleApp=this
        super.onCreate()
        component = DaggerAppComponent.factory().create(DriverModule("Shijilal"))

    }

}

