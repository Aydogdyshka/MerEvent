package com.mertech.merevent.domain.event.usecases

import com.mertech.merevent.data.repository.EventRepository
import com.mertech.merevent.domain.event.Event

class RemoveEventUseCase(private val repository: EventRepository) {
    suspend operator fun invoke(event: Event) = repository.removeEvent(event)
}