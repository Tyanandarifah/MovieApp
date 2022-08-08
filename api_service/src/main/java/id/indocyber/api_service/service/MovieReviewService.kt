package id.indocyber.api_service.service

import id.indocyber.api_service.Constants
import id.indocyber.common.entity.movie_review.MovieReviewResponse
import retrofit2.Response
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieReviewService {
    suspend fun getMovieReviews(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String = Constants.API_KEY,
        @Query("page") page: Int
    ) : Response<MovieReviewResponse>
}