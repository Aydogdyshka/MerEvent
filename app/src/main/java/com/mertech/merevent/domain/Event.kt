package com.mertech.merevent.domain


data class Event(
    val id: Int,
    var name: String,
    var description: String,
    var date: Long,
    var location: String,
    var attended: Boolean,
    var missed: Boolean
)