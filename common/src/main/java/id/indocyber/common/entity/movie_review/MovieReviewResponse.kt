package id.indocyber.common.entity.movie_review

import com.google.gson.annotations.SerializedName

data class MovieReviewResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<MovieReview>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)