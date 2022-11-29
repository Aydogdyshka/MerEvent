package com.mertech.merevent.usecases

import com.mertech.merevent.data.repository.EventRepository

class GetByIdUseCase(
    private val repository: EventRepository
) {
    suspend operator fun invoke(id: Int) = repository.getById(id)
}