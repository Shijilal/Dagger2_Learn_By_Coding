package com.lalsoft.dagger2learning.dagger

import com.lalsoft.dagger2learning.MainActivity
import com.lalsoft.dagger2learning.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@PerActivity
@Component(dependencies = [AppComponent::class],modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {
    fun getCar(): Car

    /** For Field Injection Method*/
    fun inject(mainActivity: MainActivity)

    @Component.Builder
   interface Builder{
        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity:Int) :Builder

        fun appComponent(appComponent: AppComponent):Builder
        fun build():ActivityComponent
   }

}