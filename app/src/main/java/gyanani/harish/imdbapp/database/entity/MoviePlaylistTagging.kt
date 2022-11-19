package gyanani.harish.imdbapp.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "MoviePlaylistTagging")
data class MoviePlaylistTagging(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val movieId: String?,
    val playListId: String?
) {

}