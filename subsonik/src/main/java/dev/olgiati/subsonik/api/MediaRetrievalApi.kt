package dev.olgiati.subsonik.api

import dev.olgiati.subsonik.model._base.SubsonicDTO
import dev.olgiati.subsonik.model.response.mediaRetrieval.GetLyricsBySongIdResponse
import dev.olgiati.subsonik.model.response.mediaRetrieval.GetLyricsResponse
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface MediaRetrievalApi {
    @GET("/rest/stream")
    suspend fun stream(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
        @Query("maxBitRate") maxBitRate: Int? = null,
        @Query("format") format: String? = null,
        @Query("timeOffset") timeOffset: Int? = null,
        @Query("size") size: Int? = null,
        @Query("estimateContentLength") estimateContentLength: Boolean? = null,
        @Query("converted") converted: Boolean? = null,
    ): Any

    @GET("/rest/download")
    suspend fun download(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
    ): Any

    @GET("/rest/getCoverArt")
    suspend fun getCoverArt(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
        @Query("size") size: Int? = null,
    ): Any

    @GET("rest/getLyrics")
    suspend fun getLyrics(
        @QueryMap params: Map<String, String>,
        @Query("artist") artist: String?,
        @Query("title") title: String?,
    ): SubsonicDTO<GetLyricsResponse>

    @GET("rest/getLyricsBySongId")
    suspend fun getLyricsBySongId(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
    ): SubsonicDTO<GetLyricsBySongIdResponse>

    @GET("/rest/getAvatar")
    suspend fun getAvatar(
        @QueryMap params: Map<String, String>,
        @Query("username") username: String,
    ): Any
}