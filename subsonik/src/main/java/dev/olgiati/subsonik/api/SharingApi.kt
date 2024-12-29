package dev.olgiati.subsonik.api

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import dev.olgiati.subsonik.model.SubsonicDTO
import dev.olgiati.subsonik.model.SubsonicResponse
import dev.olgiati.subsonik.model.sharing.createShare.CreateShareResponse
import dev.olgiati.subsonik.model.sharing.getShares.GetSharesResponse

interface SharingApi {
    @GET("/rest/getShares")
    suspend fun getShares(
        @QueryMap params: Map<String, String>,
    ): SubsonicDTO<GetSharesResponse>

    @GET("/rest/createShare")
    suspend fun createShare(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
        @Query("description") description: String? = null,
        @Query("expires") expires: Int? = null,
    ): SubsonicDTO<CreateShareResponse>

    @GET("/rest/updateShare")
    suspend fun updateShare(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
        @Query("description") description: String? = null,
        @Query("expires") expires: Int? = null,
    ): SubsonicDTO<SubsonicResponse>

    @GET("/rest/deleteShare")
    suspend fun deleteShare(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
    ): SubsonicDTO<SubsonicResponse>
}
