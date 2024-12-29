package dev.olgiati.subsonik.api

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import dev.olgiati.subsonik.model.SubsonicDTO
import dev.olgiati.subsonik.model.SubsonicResponse
import dev.olgiati.subsonik.model.playlists.GetPlaylistResponse
import dev.olgiati.subsonik.model.playlists.GetPlaylistsResponse

interface PlaylistsApi {
    @GET("/rest/getPlaylists")
    suspend fun getPlaylists(
        @QueryMap params: Map<String, String>,
        @Query("username") username: String? = null,
    ): SubsonicDTO<GetPlaylistsResponse>

    @GET("/rest/getPlaylist")
    suspend fun getPlaylist(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
    ): SubsonicDTO<GetPlaylistResponse>

    @GET("/rest/createPlaylist")
    suspend fun createPlaylist(
        @QueryMap params: Map<String, String>,
        @Query("playlistId") playlistId: String? = null,
        @Query("name") name: String? = null,
        @Query("songId") songId: Array<String>? = null,
    ): SubsonicDTO<GetPlaylistResponse>

    @GET("/rest/updatePlaylist")
    suspend fun updatePlaylist(
        @QueryMap params: Map<String, String>,
        @Query("playlistId") playlistId: String,
        @Query("name") name: String? = null,
        @Query("comment") comment: String? = null,
        @Query("public") public: Boolean? = null,
        @Query("songIdToAdd") songIdToAdd: Array<String>? = null,
        @Query("songIndexToRemove") songIndexToRemove: Array<Int>? = null,
    ): SubsonicDTO<SubsonicResponse>

    @GET("/rest/deletePlaylist")
    suspend fun deletePlaylist(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
    ): SubsonicDTO<SubsonicResponse>
}
