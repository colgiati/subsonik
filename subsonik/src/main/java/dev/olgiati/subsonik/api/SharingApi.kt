package dev.olgiati.subsonik.api

import dev.olgiati.subsonik.model._base.SubsonicDTO
import dev.olgiati.subsonik.model._base.SubsonicResponse
import dev.olgiati.subsonik.model.response.sharing.CreateShareResponse
import dev.olgiati.subsonik.model.response.sharing.GetSharesResponse
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

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
