package dev.olgiati.subsonik.api

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import dev.olgiati.subsonik.model.SubsonicDTO
import dev.olgiati.subsonik.model.browsing.getAlbum.GetAlbumResponse
import dev.olgiati.subsonik.model.browsing.getAlbumInfo.GetAlbumInfoResponse
import dev.olgiati.subsonik.model.browsing.getArtist.GetArtistResponse
import dev.olgiati.subsonik.model.browsing.getArtistInfo.GetArtistInfoResponse
import dev.olgiati.subsonik.model.browsing.getArtists.GetArtistsResponse
import dev.olgiati.subsonik.model.browsing.getGenres.GetGenresResponse
import dev.olgiati.subsonik.model.browsing.getIndexes.GetIndexesResponse
import dev.olgiati.subsonik.model.browsing.getMusicDirectory.GetMusicDirectoryResponse
import dev.olgiati.subsonik.model.browsing.getMusicFolders.GetMusicFoldersResponse
import dev.olgiati.subsonik.model.browsing.getSimilarSongs.GetSimilarSongsResponse
import dev.olgiati.subsonik.model.browsing.getSong.GetSongResponse
import dev.olgiati.subsonik.model.browsing.getTopSongs.GetTopSongsResponse
import java.util.*

interface BrowsingApi {
    @GET("/rest/getMusicFolders")
    suspend fun getMusicFolders(@QueryMap params: Map<String, String>): SubsonicDTO<GetMusicFoldersResponse>

    @GET("/rest/getIndexes")
    suspend fun getIndexes(
        @QueryMap params: Map<String, String>,
        @Query("musicFolderId") musicFolderId: Int? = null,
        @Query("ifModifiedSince") ifModifiedSince: Date? = null,
    ): SubsonicDTO<GetIndexesResponse>

    @GET("/rest/getMusicDirectory")
    suspend fun getMusicDirectory(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
    ): SubsonicDTO<GetMusicDirectoryResponse>

    @GET("/rest/getGenres")
    suspend fun getGenres(@QueryMap params: Map<String, String>): SubsonicDTO<GetGenresResponse>

    @GET("/rest/getArtists")
    suspend fun getArtists(
        @QueryMap params: Map<String, String>,
        @Query("musicFolderId") musicFolderId: Int? = null,
    ): SubsonicDTO<GetArtistsResponse>

    @GET("/rest/getArtist")
    suspend fun getArtist(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
    ): SubsonicDTO<GetArtistResponse>

    @GET("/rest/getAlbum")
    suspend fun getAlbum(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
    ): SubsonicDTO<GetAlbumResponse>

    @GET("/rest/getSong")
    suspend fun getSong(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
    ): SubsonicDTO<GetSongResponse>

    @GET("/rest/getArtistInfo")
    suspend fun getArtistInfo(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
        @Query("count") count: Int? = null,
        @Query("includeNotPresent") includeNotPresent: Boolean? = null,
    ): SubsonicDTO<GetArtistInfoResponse>

    @GET("/rest/getArtistInfo2")
    suspend fun getArtistInfo2(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
        @Query("count") count: Int? = null,
        @Query("includeNotPresent") includeNotPresent: Boolean? = null,
    ): SubsonicDTO<GetArtistInfoResponse>

    @GET("/rest/getAlbumInfo")
    suspend fun getAlbumInfo(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
    ): SubsonicDTO<GetAlbumInfoResponse>

    @GET("/rest/getAlbumInfo2")
    suspend fun getAlbumInfo2(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
    ): SubsonicDTO<GetAlbumInfoResponse>

    @GET("/rest/getSimilarSongs")
    suspend fun getSimilarSongs(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
        @Query("count") count: Int? = null,
    ): SubsonicDTO<GetSimilarSongsResponse>


    @GET("/rest/getSimilarSongs2")
    suspend fun getSimilarSongs2(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
        @Query("count") count: Int? = null,
    ): SubsonicDTO<GetSimilarSongsResponse>

    @GET("/rest/getTopSongs")
    suspend fun getTopSongs(
        @QueryMap params: Map<String, String>,
        @Query("artist") id: String,
        @Query("count") count: Int? = null,
    ): SubsonicDTO<GetTopSongsResponse>
}
