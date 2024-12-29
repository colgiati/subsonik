package dev.olgiati.subsonik.api

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import dev.olgiati.subsonik.model.SubsonicDTO
import dev.olgiati.subsonik.model.SubsonicResponse
import dev.olgiati.subsonik.model.userManagement.getUsers.GetUsersResponse

interface UserManagementApi {
    @GET("/rest/getUsers")
    suspend fun getUsers(@QueryMap params: Map<String, String>): SubsonicDTO<GetUsersResponse>

    @GET("/rest/createUser")
    suspend fun createUser(
        @QueryMap params: Map<String, String>,
        @Query("username") username: String,
        @Query("password") password: String,
        @Query("email") email: String,
        @Query("ldapAuthenticated") ldapAuthenticated: Boolean? = null,
        @Query("adminRole") adminRole: Boolean? = null,
        @Query("settingsRole") settingsRole: Boolean? = null,
        @Query("streamRole") streamRole: Boolean? = null,
        @Query("jukeboxRole") jukeboxRole: Boolean? = null,
        @Query("downloadRole") downloadRole: Boolean? = null,
        @Query("uploadRole") uploadRole: Boolean? = null,
        @Query("playlistRole") playlistRole: Boolean? = null,
        @Query("coverArtRole") coverArtRole: Boolean? = null,
        @Query("commentRole") commentRole: Boolean? = null,
        @Query("podcastRole") podcastRole: Boolean? = null,
        @Query("shareRole") shareRole: Boolean? = null,
        @Query("videoConversionRole") videoConversionRole: Boolean? = null,
        @Query("musicFolderId") musicFolderId: Array<Int>? = null,
    ): SubsonicDTO<SubsonicResponse>

    @GET("/rest/updateUser")
    suspend fun updateUser(
        @QueryMap params: Map<String, String>,
        @Query("username") username: String,
        @Query("password") password: String? = null,
        @Query("email") email: String? = null,
        @Query("ldapAuthenticated") ldapAuthenticated: Boolean? = null,
        @Query("adminRole") adminRole: Boolean? = null,
        @Query("settingsRole") settingsRole: Boolean? = null,
        @Query("streamRole") streamRole: Boolean? = null,
        @Query("jukeboxRole") jukeboxRole: Boolean? = null,
        @Query("downloadRole") downloadRole: Boolean? = null,
        @Query("uploadRole") uploadRole: Boolean? = null,
        @Query("coverArtRole") coverArtRole: Boolean? = null,
        @Query("commentRole") commentRole: Boolean? = null,
        @Query("podcastRole") podcastRole: Boolean? = null,
        @Query("shareRole") shareRole: Boolean? = null,
        @Query("videoConversionRole") videoConversionRole: Boolean? = null,
        @Query("musicFolderId") musicFolderId: Array<Int>? = null,
        @Query("maxBitRate") maxBitRate: Int? = null,
    ): SubsonicDTO<SubsonicResponse>

    @GET("/rest/deleteUser")
    suspend fun deleteUser(
        @QueryMap params: Map<String, String>,
        @Query("username") username: String,
    ): SubsonicDTO<SubsonicResponse>

    @GET("/rest/changePassword")
    suspend fun changePassword(
        @QueryMap params: Map<String, String>,
        @Query("username") username: String,
        @Query("password") password: String,
    ): SubsonicDTO<SubsonicResponse>
}
