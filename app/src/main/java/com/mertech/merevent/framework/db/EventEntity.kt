package com.mertech.merevent.framework.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "event")
class EventEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    val name: String,
    val description: String,
    val date: Long,
    val location: String,
    val attended: Boolean,
    val missed: Boolean
) {

}
