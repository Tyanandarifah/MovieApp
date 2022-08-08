package id.indocyber.api_service.service

import id.indocyber.api_service.Constants
import id.indocyber.common.entity.discover_movie.DiscoverMovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface DiscoverMovieService {
    @GET("discover/movie")
    suspend fun getMovieByGenre(
        @Query("with_genres") genres: String,
        @Query("page") page: Int = 1,
        @Query("api_key") apiKey: String = Constants.API_KEY
    ) : Response<DiscoverMovieResponse>
}