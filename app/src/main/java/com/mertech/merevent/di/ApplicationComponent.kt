package com.mertech.merevent.di

import com.mertech.merevent.data.repository.EventRepository
import com.mertech.merevent.data.repository.EventRepositoryImpl
import com.mertech.merevent.presentation.evenlist.EventListFragment
import com.mertech.merevent.presentation.eventdetails.EventDetailFragment
import dagger.Component
import dagger.Provides
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class, RepositoryModule::class])
interface ApplicationComponent {

    fun inject(eventListFragment: EventListFragment)
    fun inject(eventDetailFragment: EventDetailFragment)

}