package gyanani.harish.imdbapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "movie")
data class MovieBean(
    @ColumnInfo(name = "movieTitle")
    @SerializedName("title") val movieTitle: String,
    @PrimaryKey
    @SerializedName("id") val id: String,
    @SerializedName("vote_average") val rating: Float?
)
