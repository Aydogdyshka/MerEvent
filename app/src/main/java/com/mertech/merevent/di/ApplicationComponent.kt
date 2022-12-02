package com.mertech.merevent.di

import com.mertech.merevent.presentation.evenlist.EventListFragment
import com.mertech.merevent.presentation.eventdetails.EventDetailFragment
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class, RepositoryModule::class])
interface ApplicationComponent {

    fun inject(eventListFragment: EventListFragment)
    fun inject(eventDetailFragment: EventDetailFragment)

}