package dev.olgiati.subsonik.service

import java.util.Date

internal interface BrowsingService : SubsonikServiceInterface {
    suspend fun getMusicFolders() = call {
        client.getMusicFolders(getParams())
    }.musicFolders.musicFolder

    suspend fun getIndexes(musicFolderId: Int? = null, ifModifiedSince: Date? = null) = call {
        client.getIndexes(
            getParams(),
            musicFolderId,
            ifModifiedSince
        )
    }.indexes.index

    suspend fun getMusicDirectory(id: String) = call {
        client.getMusicDirectory(getParams(), id)
    }.directory

    suspend fun getGenres() = call {
        client.getGenres(getParams())
    }.genres.genre

    suspend fun getArtists(musicFolderId: Int? = null) = call {
        client.getArtists(getParams(), musicFolderId)
    }.artists

    suspend fun getArtist(id: String) = call {
        client.getArtist(getParams(), id)
    }.artist

    suspend fun getAlbum(id: String) = call {
        client.getAlbum(getParams(), id)
    }.album

    suspend fun getSong(id: String) = call {
        client.getSong(getParams(), id)
    }.song

    suspend fun getArtistInfo(
        id: String,
        count: Int? = null,
        includeNotPresent: Boolean? = null
    ) = call {
        client.getArtistInfo(
            getParams(),
            id,
            count,
            includeNotPresent
        )
    }.artistInfo

    suspend fun getArtistInfo2(
        id: String,
        count: Int? = null,
        includeNotPresent: Boolean? = null
    ) = call {
        client.getArtistInfo2(
            getParams(),
            id,
            count,
            includeNotPresent
        )
    }.artistInfo2

    suspend fun getAlbumInfo(id: String) = call {
        client.getAlbumInfo(getParams(), id)
    }.albumInfo

    suspend fun getAlbumInfo2(id: String) = call {
        client.getAlbumInfo2(getParams(), id)
    }.albumInfo

    suspend fun getSimilarSongs(id: String, count: Int? = null) = call {
        client.getSimilarSongs(getParams(), id, count)
    }.similarSongs.song

    suspend fun getSimilarSongs2(id: String, count: Int? = null) = call {
        client.getSimilarSongs2(getParams(), id, count)
    }.similarSongs.song

    suspend fun getTopSongs(artist: String, count: Int? = null) = call {
        client.getTopSongs(getParams(), artist, count)
    }.topSongs.song
}