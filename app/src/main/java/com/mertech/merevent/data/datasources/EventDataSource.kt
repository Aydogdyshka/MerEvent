package com.mertech.merevent.data.datasources

import com.mertech.merevent.domain.Event

interface EventDataSource {
    suspend fun addEvent(event: Event)
    suspend fun readAll(): List<Event>
    suspend fun getById(id: Int): Event
    suspend fun remove(event: Event)
    suspend fun updateEvent(event: Event)
}