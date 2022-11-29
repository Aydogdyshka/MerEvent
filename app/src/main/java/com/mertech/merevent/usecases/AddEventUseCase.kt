package com.mertech.merevent.usecases

import com.mertech.merevent.data.repository.EventRepository
import com.mertech.merevent.domain.Event

class AddEventUseCase(
    private val eventRepository: EventRepository
) {
    suspend operator fun invoke(event: Event) = eventRepository.addEvent(event)
}