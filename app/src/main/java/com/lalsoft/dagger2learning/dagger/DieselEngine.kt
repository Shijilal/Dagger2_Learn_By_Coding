package com.lalsoft.dagger2learning.dagger

import android.util.Log
import com.lalsoft.dagger2learning.car.Engine
import javax.inject.Inject


class DieselEngine @Inject constructor(private val horsePower: Int) : Engine {
    override fun start() {
        Log.d(
            TAG,
            "Diesel engine started. Horsepower: $horsePower"
        )
    }

    companion object {
        private const val TAG = "Car"
    }
}