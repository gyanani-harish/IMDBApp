package gyanani.harish.imdbapp.database


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import gyanani.harish.imdbapp.data.model.MovieBean
import gyanani.harish.imdbapp.database.dao.MoviesDao
import gyanani.harish.imdbapp.database.entity.MoviePlaylistTagging
import gyanani.harish.imdbapp.database.entity.PlaylistBean


@Database(entities = [(MovieBean::class), PlaylistBean::class, MoviePlaylistTagging::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun moviesDao(): MoviesDao

    companion object {

        /**
         * The only instance
         */
        private var sInstance: AppDatabase? = null

        /**
         * Gets the singleton instance of SampleDatabase.
         *
         * @param context The context.
         * @return The singleton instance of SampleDatabase.
         */
        @Synchronized
        fun getInstance(context: Context): AppDatabase {
            if (sInstance == null) {
                sInstance = Room
                    .databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "HarishDB.db"
                    )
                    .fallbackToDestructiveMigration()
                    //.allowMainThreadQueries()
                    .build()
            }
            return sInstance!!
        }
    }

}