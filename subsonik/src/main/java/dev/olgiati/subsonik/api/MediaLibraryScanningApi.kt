package dev.olgiati.subsonik.api

import dev.olgiati.subsonik.model._base.SubsonicDTO
import dev.olgiati.subsonik.model.response.mediaLibraryScanning.GetScanStatusResponse
import dev.olgiati.subsonik.model.response.mediaLibraryScanning.StartScanResponse
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap


interface MediaLibraryScanningApi {
    @GET("/rest/getScanStatus")
    suspend fun getScanStatus(
        @QueryMap params: Map<String, String>
    ): SubsonicDTO<GetScanStatusResponse>

    /**
     * Query parameter "fullScan" is for Navidrome servers only
     */
    @GET("/rest/startScan")
    suspend fun startScan(
        @QueryMap params: Map<String, String>,
        @Query("fullScan") fullScan: Boolean? = null,
    ): SubsonicDTO<StartScanResponse>
}
