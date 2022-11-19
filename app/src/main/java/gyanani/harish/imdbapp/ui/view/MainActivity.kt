package gyanani.harish.imdbapp.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import gyanani.harish.imdbapp.R

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, MoviesListFragment(), "MoviesListFragment")
                .commit()
        }
    }
}