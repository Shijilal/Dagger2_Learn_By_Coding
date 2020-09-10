package com.lalsoft.dagger2learning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lalsoft.dagger2learning.car.Car
import com.lalsoft.dagger2learning.dagger.ActivityComponent
import com.lalsoft.dagger2learning.dagger.AppComponent
import com.lalsoft.dagger2learning.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
//    private lateinit var car: Car
    @Inject
    lateinit var car1: Car
    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** First Method*/
//        val component:CarComponent =DaggerCarComponent.create()
//        car=component.getCar()
//        car.drive()

        /**Field Injection*/
//        val component: CarComponent =DaggerCarComponent.builder()
//                .horsePower(150)
//                .engineCapacity(1400)
//                .build()
        val appComponent: AppComponent = ExampleApp.component
        val component:ActivityComponent=DaggerActivityComponent.builder()
            .horsePower(150)
            .engineCapacity(1400)
            .appComponent(appComponent)
            .build()

        component.inject(this)
        car1.drive()
        car2.drive()


    }
}