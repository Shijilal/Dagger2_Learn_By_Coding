package com.lalsoft.dagger2learning.dagger

import android.util.Log
import com.lalsoft.dagger2learning.car.Engine
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horse power")private val horsePower: Int,
    @Named("engine capacity")private val engineCapacity: Int
) : Engine {

    override fun start() {
        Log.d(
            TAG, """
     Petrol engine started. 
     Horsepower: $horsePower
     Engine capacity: $engineCapacity
     """.trimIndent()
        )
    }

    companion object {
        private const val TAG = "Car"
    }
}