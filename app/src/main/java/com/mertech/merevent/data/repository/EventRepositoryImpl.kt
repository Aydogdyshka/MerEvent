package com.mertech.merevent.data.repository

import com.mertech.merevent.data.datasources.EventDataSource
import com.mertech.merevent.domain.Event

class EventRepositoryImpl(private val eventDataSource: EventDataSource): EventRepository {

    override suspend fun addEvent(event: Event) {
        eventDataSource.addEvent(event)
    }

    override suspend fun removeEvent(event: Event) {
        eventDataSource.remove(event)
    }

    override suspend fun readAll(): List<Event> {
        return eventDataSource.readAll()
    }

    override suspend fun updateEvent(event: Event) {
        return eventDataSource.updateEvent(event)
    }

    override suspend fun getById(id: Int) {
        eventDataSource.getById(id)
    }
}