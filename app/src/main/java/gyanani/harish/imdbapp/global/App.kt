package gyanani.harish.imdbapp.global

import android.app.Application
import android.content.Context

/**
 * Recycler view
 *  -design row
 *  -adapter
 *  -provide data
 *  -provide callbacks
 * bottom sheet
 *  -data to show
 * playlist local db
 *  - setup room
 *  - dao and data class
 *  - run on another thread
 * filter by playlist
 *  - fetch data from local db
 */
class App: Application() {
    init {
        instance = this
    }

    companion object {
        private var instance: App? = null

        fun applicationContext() : Context {
            return instance!!.applicationContext
        }
        fun application() : Application {
            return instance!!
        }
    }
}