package dev.olgiati.subsonik.api

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import dev.olgiati.subsonik.model._base.SubsonicDTO
import dev.olgiati.subsonik.model._base.SubsonicResponse

interface MediaAnnotationApi {
    @GET("/rest/star")
    suspend fun star(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String? = null,
        @Query("albumId") albumId: String? = null,
        @Query("artistId") artistId: String? = null,
    ): SubsonicDTO<SubsonicResponse>

    @GET("/rest/unstar")
    suspend fun unstar(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String? = null,
        @Query("albumId") albumId: String? = null,
        @Query("artistId") artistId: String? = null,
    ): SubsonicDTO<SubsonicResponse>

    @GET("/rest/setRating")
    suspend fun setRating(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
        @Query("rating") rating: Int,
    ): SubsonicDTO<SubsonicResponse>

    @GET("/rest/scrobble")
    suspend fun scrobble(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
        @Query("time") time: Int? = null,
        @Query("submission") submission: Boolean? = null,
    ): SubsonicDTO<SubsonicResponse>
}
