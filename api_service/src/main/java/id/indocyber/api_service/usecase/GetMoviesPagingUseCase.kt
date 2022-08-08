package id.indocyber.api_service.usecase

import id.indocyber.api_service.Constants
import id.indocyber.api_service.paging.DiscoverMoviePager
import id.indocyber.api_service.service.DiscoverMovieService

class GetMoviesPagingUseCase(
    val discoverMovieService: DiscoverMovieService
) {
    operator fun invoke(args: String) =
        DiscoverMoviePager.createPager(
            Constants.DEFAULT_PAGE_SIZE,
            discoverMovieService,
            args).flow
}