package gyanani.harish.imdbapp.ui.view

import android.graphics.Movie
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import gyanani.harish.imdbapp.R
import gyanani.harish.imdbapp.data.model.MovieBean
import gyanani.harish.imdbapp.ui.adapter.MoviesListAdapter
import gyanani.harish.imdbapp.ui.viewmodel.MoviesListViewModel
import gyanani.harish.imdbapp.utils.Status

class MoviesListFragment: Fragment() {
    private val viewModel: MoviesListViewModel by activityViewModels()
    lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movies_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recycler_movies_list)
        val floatingButton = view.findViewById<FloatingActionButton>(R.id.floating_filter_icon)
        floatingButton.setOnClickListener { clickedView->
            //todo playlist options, whichever is chosen, fetch movies from database accordingly
        }
        recyclerView.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        viewModel.fetchData().observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    it.data?.let { data ->
                        recyclerView.adapter = MoviesListAdapter(data, { clickedView->
                            //open bottomsheet
                            //show existing playlists and new option
                            //on clicking on existing -> add movie entry in database for that playlist
                            //on new -> create a new playlist, add moview for that playlist
                        })

                    }
                }
                Status.LOADING -> {
                }
                Status.ERROR -> {
                }
            }
        })

    }
}