package id.indocyber.api_service.usecase

import id.indocyber.api_service.service.MovieDetailsService
import id.indocyber.common.base.BaseResponse
import kotlinx.coroutines.flow.flow

class GetMovieDetailsUseCase(
    private val movieDetailsService: MovieDetailsService
) {
    operator fun invoke(movieId: Int) = flow {
        try {
            emit(BaseResponse.loading())
            val data = movieDetailsService.getMovieDetails(movieId)
            if (data.isSuccessful) {
                data.body()?.let {
                    emit(BaseResponse.success(it))
                } ?: run {
                    emit(BaseResponse.failureBackend<MovieDetailsService>(
                        null
                    ))
                }
            }
        } catch (e: Exception) {
            emit(BaseResponse.failure(e))
        }
    }
}