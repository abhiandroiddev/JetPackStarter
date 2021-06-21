package com.raywenderlich.android.imet.data.db

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.raywenderlich.android.imet.data.model.People

/**
 * Created by Abhijit Roy
 */
@Dao
interface PeopleDao {
    /**
     * Select All
     */
/*    @Query("SELECT * FROM People ORDER BY id DESC")
    fun getAll() : List<People>*/

    /**
     * Live Data implementation in getAll()
     */

    @Query("SELECT * FROM People ORDER BY id DESC")
    fun getAll() : LiveData<List<People>>

    /**
     * Insert
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(people: People)

    /**
     * Delete
     */
    @Query("DELETE FROM people")
    fun deleteAll()

    /**
     * Select by id
     */
    @Query("SELECT * FROM People where id = :id")
    fun find(id: Int):People
}