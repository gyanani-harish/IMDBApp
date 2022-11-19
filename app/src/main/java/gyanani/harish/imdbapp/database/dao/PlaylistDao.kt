package gyanani.harish.imdbapp.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import gyanani.harish.imdbapp.database.entity.PlaylistBean

@Dao
interface PlaylistDao {
    @get:Query("SELECT * FROM playlist")
    val all: MutableList<PlaylistBean>

    @Insert
    fun insertAll(jokes: List<PlaylistBean>): List<Long>

}