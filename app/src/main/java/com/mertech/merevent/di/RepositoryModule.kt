package com.mertech.merevent.di

import com.mertech.merevent.data.repository.EventRepository
import com.mertech.merevent.data.repository.EventRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class RepositoryModule {
    @Binds
    abstract fun provideRepository(eventRepositoryImpl: EventRepositoryImpl): EventRepository
}