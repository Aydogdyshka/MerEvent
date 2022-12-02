package com.mertech.merevent.presentation.evenlist.di

import androidx.lifecycle.ViewModel
import com.mertech.merevent.presentation.evenlist.EventListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class EventListModule {

    @Binds
    abstract fun bindViewModel(viewModel: EventListViewModel): ViewModel

}