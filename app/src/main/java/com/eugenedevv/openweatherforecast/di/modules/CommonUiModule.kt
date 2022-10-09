package com.eugenedevv.openweatherforecast.di.modules

import androidx.lifecycle.ViewModel
import com.eugenedevv.openweatherforecast.di.AssistedSavedStateViewModelFactory
import dagger.Module
import dagger.multibindings.Multibinds

/**
 * Created by EugeneDevv on 09/10/2022.
 */
@Module
abstract class CommonUiModule {
    @Multibinds
    abstract fun viewModels(): Map<Class<out ViewModel>, @JvmSuppressWildcards ViewModel>

    @Multibinds
    abstract fun assistedViewModels(): Map<Class<out ViewModel>, @JvmSuppressWildcards AssistedSavedStateViewModelFactory<out ViewModel>>
}