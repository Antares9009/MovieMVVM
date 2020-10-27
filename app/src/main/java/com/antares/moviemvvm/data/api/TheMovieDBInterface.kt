package com.antares.moviemvvm.data.api

import com.antares.moviemvvm.data.vo.MovieDetails
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface TheMovieDBInterface {
    //https://api.themoviedb.org/3/movie/popular?api_key=9f6c3d84f781a5abd066dda6531609f1
    //https://api.themoviedb.org/3/movie/299534?api_key=9f6c3d84f781a5abd066dda6531609f1
    //https://api.themoviedb.org/3/

    //Observable
    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Single<MovieDetails>

}