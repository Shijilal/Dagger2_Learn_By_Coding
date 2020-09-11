package com.lalsoft.dagger2learning.dagger

import com.lalsoft.dagger2learning.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule(private val driverName: String) {
    @Provides
    @Singleton
    fun provideDriver(): Driver {
        return Driver(driverName)
    }
}