package gyanani.harish.imdbapp.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import gyanani.harish.imdbapp.data.model.MovieBean


@Dao
interface MoviesDao {
    @get:Query("SELECT * FROM movie")
    val all: MutableList<MovieBean>

    @Insert
    fun insertAll(jokes: List<MovieBean>): List<Long>

    @Delete
    fun delete(jokes: List<MovieBean>)

}