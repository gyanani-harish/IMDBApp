package gyanani.harish.imdbapp.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import gyanani.harish.imdbapp.data.model.MovieBean

@Entity(
    tableName = "playlist")
data class PlaylistBean(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name ="name")
    val name: String,
    val movieList: List<MovieBean>
)