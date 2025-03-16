package dev.olgiati.subsonik.api

import dev.olgiati.subsonik.model._base.SubsonicDTO
import dev.olgiati.subsonik.model._base.SubsonicResponse
import dev.olgiati.subsonik.model.response.system.GetLicenseResponse
import dev.olgiati.subsonik.model.response.system.GetOpenSubsonicExtensionsResponse
import dev.olgiati.subsonik.model.response.system.TokenInfoResponse
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface SystemApi {
    @GET("/rest/ping")
    suspend fun ping(@QueryMap params: Map<String, String>): SubsonicDTO<SubsonicResponse>

    @GET("/rest/getLicense")
    suspend fun getLicense(@QueryMap params: Map<String, String>): SubsonicDTO<GetLicenseResponse>

    @GET("/rest/getOpenSubsonicExtensions")
    suspend fun getOpenSubsonicExtensions(@QueryMap params: Map<String, String>): SubsonicDTO<GetOpenSubsonicExtensionsResponse>

    @GET("/rest/tokenInfo")
    suspend fun tokenInfo(
        @QueryMap params: Map<String, String>,
        @Query("apiKey") id: String,
    ): SubsonicDTO<TokenInfoResponse>
}
