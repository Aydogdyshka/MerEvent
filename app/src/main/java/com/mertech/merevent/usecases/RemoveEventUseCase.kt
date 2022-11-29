package com.mertech.merevent.usecases

import com.mertech.merevent.data.repository.EventRepository
import com.mertech.merevent.domain.Event

class RemoveEventUseCase(private val repository: EventRepository) {
    suspend operator fun invoke(event: Event) = repository.removeEvent(event)
}