package com.lalsoft.dagger2learning.dagger

import com.lalsoft.dagger2learning.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule {
    @Provides
    @Singleton
    fun provideDriver(): Driver {
        return Driver()
    }
}