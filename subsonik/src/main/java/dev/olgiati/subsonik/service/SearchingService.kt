package dev.olgiati.subsonik.service

import kotlin.Int

internal interface SearchingService : SubsonikServiceInterface {
    suspend fun search2(
        query: String,
        artistCount: Int? = null,
        artistOffset: Int? = null,
        albumCount: Int? = null,
        albumOffset: Int? = null,
        songCount: Int? = null,
        songOffset: Int? = null,
        musicFolderId: Int? = null,
    ) = call {
        client.search2(
            getParams(),
            query,
            artistCount,
            artistOffset,
            albumCount,
            albumOffset,
            songCount,
            songOffset,
            musicFolderId,
        )
    }.searchResult

    suspend fun search3(
        query: String,
        artistCount: Int? = null,
        artistOffset: Int? = null,
        albumCount: Int? = null,
        albumOffset: Int? = null,
        songCount: Int? = null,
        songOffset: Int? = null,
        musicFolderId: Int? = null,
    ) = call {
        client.search3(
            getParams(),
            query,
            artistCount,
            artistOffset,
            albumCount,
            albumOffset,
            songCount,
            songOffset,
            musicFolderId,
        )
    }.searchResult
}