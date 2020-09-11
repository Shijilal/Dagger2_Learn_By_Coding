package com.lalsoft.dagger2learning.dagger

import com.lalsoft.dagger2learning.car.DieselEngine
import com.lalsoft.dagger2learning.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {
    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }

    @Provides
    fun provideEngine(engine: DieselEngine): Engine {
        return engine
    }
}