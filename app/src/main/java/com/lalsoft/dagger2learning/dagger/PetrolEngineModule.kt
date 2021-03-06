package com.lalsoft.dagger2learning.dagger

import com.lalsoft.dagger2learning.car.Engine
import com.lalsoft.dagger2learning.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
     abstract fun  bindEngine(engine: PetrolEngine): Engine
}