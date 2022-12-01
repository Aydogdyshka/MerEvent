package com.mertech.merevent.data.mappers

import com.mertech.merevent.domain.event.Event
import com.mertech.merevent.framework.db.EventEntity

fun EventEntity.toDomain(): Event {
    return Event(
        this.id,
        this.name,
        this.description,
        this.date,
        this.location,
        this.attended,
        this.missed
    )
}

fun Event.toEntity(): EventEntity{
    return EventEntity(
        this.id,
        this.name,
        this.description,
        this.date,
        this.location,
        this.attended,
        this.missed
    )
}