package id.indocyber.api_service.service

import id.indocyber.api_service.Constants
import id.indocyber.common.entity.movie_details.MovieDetailsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieDetailsService {
    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String = Constants.API_KEY
    ) : Response<MovieDetailsResponse>
}