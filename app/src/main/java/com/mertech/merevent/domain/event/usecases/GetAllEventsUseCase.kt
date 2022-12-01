package com.mertech.merevent.domain.event.usecases

import com.mertech.merevent.data.repository.EventRepository
import javax.inject.Inject

class GetAllEventsUseCase @Inject constructor(
    private val eventRepository: EventRepository
) {
    suspend operator fun invoke() = eventRepository.readAll()
}