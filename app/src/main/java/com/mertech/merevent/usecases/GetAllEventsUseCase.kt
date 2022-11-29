package com.mertech.merevent.usecases

import com.mertech.merevent.data.repository.EventRepository

class GetAllEventsUseCase(
    private val eventRepository: EventRepository
) {
    suspend operator fun invoke() = eventRepository.readAll()
}