package com.lalsoft.dagger2learning.car

import android.util.Log
import javax.inject.Inject

private const val TAG = "Car"

class Tires @Inject constructor(){

    fun inflate(){
        Log.d(TAG, "inflated Tires")
    }
}