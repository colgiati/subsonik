package dev.olgiati.subsonik.api

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface MediaRetrievalApi {
    @GET("/rest/getCoverArt")
    suspend fun getCoverArt(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
        @Query("size") size: Int? = null,
    ): Any

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
}