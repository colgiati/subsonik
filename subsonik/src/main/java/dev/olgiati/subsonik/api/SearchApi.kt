package dev.olgiati.subsonik.api

import Search3Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import dev.olgiati.subsonik.model.SubsonicDTO
import dev.olgiati.subsonik.model.searching.search2.Search2Response

interface SearchApi {
    @GET("/rest/search2")
    suspend fun search2(
        @QueryMap params: Map<String, String>,
        @Query("query") query: String,
        @Query("artistCount") artistCount: Int? = null,
        @Query("artistOffset") artistOffset: Int? = null,
        @Query("albumCount") albumCount: Int? = null,
        @Query("albumOffset") albumOffset: Int? = null,
        @Query("songCount") songCount: Int? = null,
        @Query("songOffset") songOffset: Int? = null,
    ): SubsonicDTO<Search2Response>

    @GET("/rest/search3")
    suspend fun search3(
        @QueryMap params: Map<String, String>,
        @Query("query") query: String,
        @Query("artistCount") artistCount: Int? = null,
        @Query("artistOffset") artistOffset: Int? = null,
        @Query("albumCount") albumCount: Int? = null,
        @Query("albumOffset") albumOffset: Int? = null,
        @Query("songCount") songCount: Int? = null,
        @Query("songOffset") songOffset: Int? = null,
    ): SubsonicDTO<Search3Response>
}
