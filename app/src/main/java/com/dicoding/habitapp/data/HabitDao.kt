package com.dicoding.habitapp.data

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteQuery
import com.dicoding.habitapp.utils.TABLE_NAME

//TODO 2 : Define data access object (DAO)
@Dao
interface HabitDao {

    @RawQuery(observedEntities = [Habit::class])
    fun getHabits(query: SupportSQLiteQuery): DataSource.Factory<Int, Habit>

    @Query("SELECT * FROM $TABLE_NAME WHERE id = :habitId")
    fun getHabitById(habitId: Int): LiveData<Habit>

    @Insert
    fun insertHabit(habit: Habit): Long

    @Insert
    fun insertAll(vararg habits: Habit)

    @Delete
    fun deleteHabit(habits: Habit)

    @Query("SELECT * FROM $TABLE_NAME WHERE priorityLevel = :level")
    fun getRandomHabitByPriorityLevel(level: String): LiveData<Habit>
}
