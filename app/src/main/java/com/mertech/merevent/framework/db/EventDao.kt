package com.mertech.merevent.framework.db

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE

@Dao
interface EventDao {
    @Insert(onConflict = REPLACE)
    suspend fun addEvent(eventEntity: EventEntity)

    @Update
    suspend fun updateEvent(eventEntity: EventEntity)

    @Query("SELECT * FROM event ORDER BY date DESC")
    suspend fun getEvents(): List<EventEntity>

    @Query("SELECT * FROM event WHERE id = :id")
    suspend fun getEventById(id: Int): EventEntity

    @Query("DELETE FROM event WHERE id = :id")
    suspend fun deleteEventById(id: Int)
}