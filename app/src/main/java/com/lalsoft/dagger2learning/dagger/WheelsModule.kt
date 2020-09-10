package com.lalsoft.dagger2learning.dagger

import com.lalsoft.dagger2learning.car.Rims
import com.lalsoft.dagger2learning.car.Tires
import com.lalsoft.dagger2learning.car.Wheels
import dagger.Module
import dagger.Provides

@Module
 class WheelsModule {
    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }
}