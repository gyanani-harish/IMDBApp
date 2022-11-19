package gyanani.harish.imdbapp.ui.viewmodel

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import gyanani.harish.imdbapp.data.model.MovieBean
import gyanani.harish.imdbapp.data.repo.MoviesRepo
import gyanani.harish.imdbapp.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MoviesListViewModel : ViewModel() {
    private val repo: MoviesRepo = MoviesRepo()
    private val _movies = MutableLiveData<Resource<MutableList<MovieBean>>>()

    /*val movies: LiveData<Resource<MutableList<MovieBean>>>
        get() = _movies*/
    fun fetchData(): LiveData<Resource<MutableList<MovieBean>>> {
        _movies.postValue(Resource.loading(null))
        viewModelScope.launch(Dispatchers.IO) {
            val moviesList = repo.fetchData()
            _movies.postValue(Resource.success(moviesList))
        }
        return _movies
    }
}