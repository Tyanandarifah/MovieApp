package id.indocyber.movieapp.fragment.movie_details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import id.indocyber.common.entity.discover_movie.DiscoverMovie
import id.indocyber.common.entity.movie_review.MovieReview
import id.indocyber.movieapp.databinding.MovieReviewItemLayoutBinding

class MovieReviewPagingAdapter : PagingDataAdapter<MovieReview, MovieReviewViewHolder>(differ) {
    override fun onBindViewHolder(holder: MovieReviewViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieReviewViewHolder {
        return MovieReviewViewHolder(
            MovieReviewItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false)
        )
    }

    companion object {
        val differ = object : DiffUtil.ItemCallback<MovieReview>() {
            override fun areItemsTheSame(oldItem: MovieReview, newItem: MovieReview): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: MovieReview,
                newItem: MovieReview
            ): Boolean {
                return oldItem == newItem
            }

        }
    }

}
class MovieReviewViewHolder(
    private val binding: MovieReviewItemLayoutBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(review: MovieReview?) {
        binding.data = review
    }
}