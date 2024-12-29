package dev.olgiati.subsonik.api

import retrofit2.http.GET
import retrofit2.http.QueryMap
import dev.olgiati.subsonik.model.SubsonicDTO
import dev.olgiati.subsonik.model.SubsonicResponse
import dev.olgiati.subsonik.model.system.getLicense.GetLicenseResponse

interface SystemApi {
    @GET("/rest/ping")
    suspend fun ping(@QueryMap params: Map<String, String>): SubsonicDTO<SubsonicResponse>

    @GET("/rest/getLicense")
    suspend fun getLicense(@QueryMap params: Map<String, String>): SubsonicDTO<GetLicenseResponse>
}
