package com.eugenedevv.openweatherforecast.di.components

import dagger.Module

/**
 * Created by EugeneDevv on 09/10/2022.
 */
@Module(
    subcomponents = [
        ActivitySubComponent::class,
        FragmentSubComponent::class
    ]
)
class AppSubComponents