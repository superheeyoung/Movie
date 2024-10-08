package com.superheeyoung.movie.features.common.repository

import com.superheeyoung.movie.features.common.entity.BaseEntity
import com.superheeyoung.movie.features.common.network.ApiResponse
import com.superheeyoung.movie.features.common.network.MovieResponse
import com.superheeyoung.movie.features.common.network.MovieResultResponse

interface MovieDataSource {
    suspend fun getMovieList() : ApiResponse<List<MovieResultResponse>>
}