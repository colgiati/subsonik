package dev.olgiati.subsonik.api

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import dev.olgiati.subsonik.model.SubsonicDTO
import dev.olgiati.subsonik.model.SubsonicResponse
import dev.olgiati.subsonik.model.internetRadio.getInternetRadioStations.GetInternetRadioStationsResponse

interface InternetRadioApi {
    @GET("/rest/getInternetRadioStations")
    suspend fun getInternetRadioStations(@QueryMap params: Map<String, String>): SubsonicDTO<GetInternetRadioStationsResponse>

    @GET("/rest/createInternetRadioStation")
    suspend fun createInternetRadioStation(
        @QueryMap params: Map<String, String>,
        @Query("streamUrl") streamUrl: String,
        @Query("name") name: String,
        @Query("homepageUrl") homepageUrl: String? = null,
    ): SubsonicDTO<SubsonicResponse>

    @GET("/rest/updateInternetRadioStation")
    suspend fun updateInternetRadioStation(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
        @Query("streamUrl") streamUrl: String,
        @Query("name") name: String,
        @Query("homepageUrl") homepageUrl: String? = null,
    ): SubsonicDTO<SubsonicResponse>

    @GET("/rest/deleteInternetRadioStation")
    suspend fun deleteInternetRadioStation(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
    ): SubsonicDTO<SubsonicResponse>
}
