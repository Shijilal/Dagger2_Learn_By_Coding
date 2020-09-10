package com.lalsoft.dagger2learning.car

import android.util.Log
import com.lalsoft.dagger2learning.dagger.PerActivity
import javax.inject.Inject

@PerActivity
class Car() {
    companion object{
        private const val TAG = "Car"
    }
    private lateinit var engine: Engine
    private lateinit var wheels: Wheels
    private lateinit var driver: Driver

    @Inject
    constructor(driver: Driver,engine: Engine, wheels: Wheels) : this() {
        this.engine = engine
        this.wheels = wheels
        this.driver=driver
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d(TAG, "$driver driving $this")
    }
}