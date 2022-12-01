package com.mertech.merevent.presentation.evenlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mertech.merevent.domain.event.Event
import com.mertech.merevent.domain.event.usecases.GetAllEventsUseCase
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

class EventListViewModel @Inject constructor(
    private val getAllEventsUseCase: GetAllEventsUseCase
): ViewModel() {

    private val _uiState = MutableLiveData(EventListUiState())
    val uiState: LiveData<EventListUiState> = _uiState

    init {
        getAllEvents()
    }

    private fun getAllEvents(){
        viewModelScope.launch {
            _uiState.postValue(
                _uiState.value?.copy(isLoading = true)
            )
            try {
                val events = getAllEventsUseCase()
                _uiState.postValue(EventListUiState(eventList = events))
            } catch (e: Exception){
                _uiState.postValue(EventListUiState(hasError = true))
            }
        }
    }


    data class EventListUiState(
        val isLoading: Boolean = false,
        val hasError: Boolean = false,
        val eventList: List<Event> = emptyList()
    )

}