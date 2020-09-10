package com.lalsoft.dagger2learning.dagger

import com.lalsoft.dagger2learning.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {
    @Provides
    fun provideEngine(): Engine {
        return DieselEngine(horsePower)
    }
}