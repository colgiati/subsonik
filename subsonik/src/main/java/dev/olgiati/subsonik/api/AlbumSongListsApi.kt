package dev.olgiati.subsonik.api

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import dev.olgiati.subsonik.model.SubsonicDTO
import dev.olgiati.subsonik.model.albumSongLists.getAlbumList.GetAlbumListResponse
import dev.olgiati.subsonik.model.albumSongLists.getNowPlaying.GetNowPlayingResponse
import dev.olgiati.subsonik.model.albumSongLists.getRandomSongs.GetRandomSongsResponse
import dev.olgiati.subsonik.model.albumSongLists.getSongsByGenre.GetSongsByGenreResponse
import dev.olgiati.subsonik.model.albumSongLists.getStarred.GetStarredResponse

interface AlbumSongListsApi {
    @GET("/rest/getAlbumList")
    suspend fun getAlbumList(
        @QueryMap params: Map<String, String>,
        @Query("type") type: String, // TODO: Use Enum
        @Query("size") size: Int? = null,
        @Query("offset") offset: Int? = null,
        @Query("fromYear") fromYear: Int? = null,
        @Query("toYear") toYear: Int? = null,
        @Query("genre") genre: String? = null,
        @Query("musicFolderId") musicFolderId: Int? = null,
    ): SubsonicDTO<GetAlbumListResponse>

    @GET("/rest/getAlbumList2")
    suspend fun getAlbumList2(
        @QueryMap params: Map<String, String>,
        @Query("type") type: String, // TODO: Use Enum
        @Query("size") size: Int? = null,
        @Query("offset") offset: Int? = null,
        @Query("fromYear") fromYear: Int? = null,
        @Query("toYear") toYear: Int? = null,
        @Query("genre") genre: String? = null,
        @Query("musicFolderId") musicFolderId: Int? = null,
    ): SubsonicDTO<GetAlbumListResponse>

    @GET("/rest/getRandomSongs")
    suspend fun getRandomSongs(
        @QueryMap params: Map<String, String>,
        @Query("size") size: Int? = null,
        @Query("genre") genre: String? = null,
        @Query("fromYear") fromYear: Int? = null,
        @Query("toYear") toYear: Int? = null,
        @Query("musicFolderId") musicFolderId: Int? = null,
    ): SubsonicDTO<GetRandomSongsResponse>

    @GET("/rest/getSongsByGenre")
    suspend fun getSongsByGenre(
        @QueryMap params: Map<String, String>,
        @Query("genre") genre: String,
        @Query("count") count: Int? = null,
        @Query("offset") offset: Int? = null,
        @Query("musicFolderId") musicFolderId: Int? = null,
    ): SubsonicDTO<GetSongsByGenreResponse>

    @GET("/rest/getNowPlaying")
    suspend fun getNowPlaying(@QueryMap params: Map<String, String>): SubsonicDTO<GetNowPlayingResponse>

    @GET("/rest/getStarred")
    suspend fun getStarred(
        @QueryMap params: Map<String, String>,
        @Query("musicFolderId") musicFolderId: Int? = null,
    ): SubsonicDTO<GetStarredResponse>

    @GET("/rest/getStarred2")
    suspend fun getStarred2(
        @QueryMap params: Map<String, String>,
        @Query("musicFolderId") musicFolderId: Int? = null,
    ): SubsonicDTO<GetStarredResponse>
}
