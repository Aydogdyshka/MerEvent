package com.mertech.merevent.data.repository

import com.mertech.merevent.domain.event.Event

interface EventRepository {
    suspend fun addEvent(event: Event)
    suspend fun removeEvent(event: Event)
    suspend fun readAll(): List<Event>
    suspend fun updateEvent(event: Event)
    suspend fun getById(id: Int)
}