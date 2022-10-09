package com.eugenedevv.openweatherforecast.di.components

import com.eugenedevv.openweatherforecast.di.ActivityScope
import com.eugenedevv.openweatherforecast.presentation.MainActivity
import dagger.Subcomponent

/**
 * Created by EugeneDevv on 09/10/2022.
 */
@ActivityScope
@Subcomponent()
interface ActivitySubComponent {

    // Factory that is used to create instances of this subcomponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): ActivitySubComponent
    }

    fun inject(mainActivity: MainActivity)

}