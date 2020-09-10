package com.lalsoft.dagger2learning.dagger

import com.lalsoft.dagger2learning.car.Driver
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getDriver():Driver
}