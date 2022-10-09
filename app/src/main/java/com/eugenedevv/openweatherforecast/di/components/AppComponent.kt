package com.eugenedevv.openweatherforecast.di.components

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * Created by EugeneDevv on 09/10/2022.
 */
@Component(
    modules = [ApiServiceModule::class, AppSubComponents::class,
        WeatherDatabaseModule::class, CommonUiModule::class]
)
@Singleton
interface AppComponent {

    fun getActivityComponentFactory(): ActivitySubComponent.Factory
    fun getFragmentComponentFactory(): FragmentSubComponent.Factory

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}