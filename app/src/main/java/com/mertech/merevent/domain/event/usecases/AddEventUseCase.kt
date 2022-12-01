package com.mertech.merevent.domain.event.usecases

import com.mertech.merevent.data.repository.EventRepository
import com.mertech.merevent.domain.event.Event
import javax.inject.Inject

class AddEventUseCase @Inject constructor(private val eventRepository: EventRepository) {
    suspend operator fun invoke(event: Event) = eventRepository.addEvent(event)
}