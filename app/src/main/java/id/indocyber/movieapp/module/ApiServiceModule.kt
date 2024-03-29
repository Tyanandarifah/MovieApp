package id.indocyber.movieapp.module

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import id.indocyber.api_service.RetrofitClient
import id.indocyber.api_service.service.*
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiServiceModule {
    @Provides
    @Singleton
    fun provideRetrofit (@ApplicationContext context: Context) = RetrofitClient.getClient(context)

    @Provides
    @Singleton
    fun provideGenreService (retrofit: Retrofit) = retrofit.create(GenreService::class.java)

    @Provides
    @Singleton
    fun provideDiscoverMovieService (retrofit: Retrofit) = retrofit.create(DiscoverMovieService::class.java)

    @Provides
    @Singleton
    fun provideMovieDetailsService (retrofit: Retrofit) = retrofit.create(MovieDetailsService::class.java)

    @Provides
    @Singleton
    fun provideMovieReviewService (retrofit: Retrofit) = retrofit.create(MovieReviewService::class.java)

    @Provides
    @Singleton
    fun provideMovieVideoService (retrofit: Retrofit) = retrofit.create(MovieVideoService::class.java)
}