package dev.olgiati.subsonik.api

import retrofit2.http.GET
import retrofit2.http.QueryMap
import dev.olgiati.subsonik.model.SubsonicDTO
import dev.olgiati.subsonik.model.mediaLibraryScanning.getScanStatus.GetScanStatusResponse
import dev.olgiati.subsonik.model.mediaLibraryScanning.startScan.StartScanResponse

interface MediaLibraryScanningApi {
    @GET("/rest/getScanStatus")
    suspend fun getScanStatus(@QueryMap params: Map<String, String>): SubsonicDTO<GetScanStatusResponse>

    @GET("/rest/startScan")
    suspend fun startScan(@QueryMap params: Map<String, String>): SubsonicDTO<StartScanResponse>
}
