package com.mertech.merevent.framework.db

import com.mertech.merevent.data.datasources.EventDataSource
import com.mertech.merevent.data.mappers.toDomain
import com.mertech.merevent.data.mappers.toEntity
import com.mertech.merevent.domain.Event

class RoomEventsDataSource(
    private val eventDao: EventDao
): EventDataSource {

    override suspend fun addEvent(event: Event) {
        eventDao.addEvent(event.toEntity())
    }

    override suspend fun readAll(): List<Event> {
        return eventDao.getEvents().map { it.toDomain() }
    }

    override suspend fun getById(id: Int): Event {
        return eventDao.getEventById(id).toDomain()
    }

    override suspend fun remove(event: Event) {
        eventDao.deleteEventById(event.id)
    }

    override suspend fun updateEvent(event: Event){
        eventDao.updateEvent(event.toEntity())
    }
}