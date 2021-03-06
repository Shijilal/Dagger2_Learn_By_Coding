package com.lalsoft.dagger2learning.dagger

import com.lalsoft.dagger2learning.MainActivity
import com.lalsoft.dagger2learning.car.Car
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {
    fun getCar(): Car

    /** For Field Injection Method*/
    fun inject(mainActivity: MainActivity)

    /** Component.Factory code*/
    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("horse power") horsePower: Int,
            @BindsInstance @Named("engine capacity") engineCapacity: Int
        ): ActivityComponent
    }


    /** Component.Builder code */

//    @Component.Builder
//   interface Builder{
//        @BindsInstance
//        fun horsePower(@Named("horse power") horsePower: Int): Builder
//
//        @BindsInstance
//        fun engineCapacity(@Named("engine capacity") engineCapacity:Int) :Builder
//
//        fun appComponent(appComponent: AppComponent):Builder
//        fun build():ActivityComponent
//   }


}