package gyanani.harish.imdbapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import gyanani.harish.imdbapp.R
import gyanani.harish.imdbapp.data.model.MovieBean

class MoviesListAdapter(private val dataList: List<MovieBean>, val playlistToggle: OnClickListener?): RecyclerView.Adapter<MoviesListAdapter.ViewHolder>() {

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val movieTitle: TextView = itemView.findViewById(R.id.txt_movie_title)
        val playlistAdditionToggle: ImageView = itemView.findViewById(R.id.img_add_to_playlist_toggle)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_movie, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = dataList[position]
        holder.movieTitle.text = model.movieTitle
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}