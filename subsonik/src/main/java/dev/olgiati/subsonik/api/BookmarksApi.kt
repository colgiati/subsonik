package dev.olgiati.subsonik.api

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import dev.olgiati.subsonik.model.SubsonicDTO
import dev.olgiati.subsonik.model.SubsonicResponse
import dev.olgiati.subsonik.model.bookmarks.getBookmarks.GetBookmarksResponse
import dev.olgiati.subsonik.model.bookmarks.getPlayQueue.GetPlayQueueResponse

interface BookmarksApi {
    @GET("/rest/getBookmarks")
    suspend fun getBookmarks(@QueryMap params: Map<String, String>): SubsonicDTO<GetBookmarksResponse>

    @GET("/rest/createBookmark")
    suspend fun createBookmark(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
        @Query("position") position: Int,
        @Query("comment") comment: String?,
    ): SubsonicDTO<SubsonicResponse>

    @GET("/rest/deleteBookmark")
    suspend fun deleteBookmark(
        @QueryMap params: Map<String, String>,
        @Query("id") id: String,
    ): SubsonicDTO<SubsonicResponse>

    @GET("/rest/getPlayQueue")
    suspend fun getPlayQueue(
        @QueryMap params: Map<String, String>,
    ): SubsonicDTO<GetPlayQueueResponse>

    @GET("/rest/savePlayQueue")
    suspend fun savePlayQueue(
        @QueryMap params: Map<String, String>,
        @Query("id") id: Array<String>,
        @Query("current") current: String? = null,
        @Query("position") position: Int? = null,
    ): SubsonicDTO<SubsonicResponse>
}
