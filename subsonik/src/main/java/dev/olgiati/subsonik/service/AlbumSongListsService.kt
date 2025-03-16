package dev.olgiati.subsonik.service

import dev.olgiati.subsonik.model.response.albumSongLists.ListType

internal interface AlbumSongListsService : SubsonikServiceInterface {
    suspend fun getAlbumList(
        type: ListType = ListType.ALPHABETICAL_BY_NAME,
        size: Int? = null,
        offset: Int? = null,
        fromYear: Int? = null,
        toYear: Int? = null,
        genre: String? = null,
        musicFolderId: Int? = null
    ) = call {
        client.getAlbumList(
            getParams(),
            type,
            size,
            offset,
            fromYear,
            toYear,
            genre,
            musicFolderId
        )
    }.albumList.album

    suspend fun getAlbumList2(
        type: ListType = ListType.ALPHABETICAL_BY_NAME,
        size: Int? = null,
        offset: Int? = null,
        fromYear: Int? = null,
        toYear: Int? = null,
        genre: String? = null,
        musicFolderId: Int? = null
    ) = call {
        client.getAlbumList2(
            getParams(),
            type,
            size,
            offset,
            fromYear,
            toYear,
            genre,
            musicFolderId
        )
    }.albumList.album

    suspend fun getRandomSongs(
        size: Int? = null,
        genre: String? = null,
        fromYear: Int? = null,
        toYear: Int? = null,
        musicFolderId: Int? = null,
    ) = call {
        client.getRandomSongs(
            getParams(),
            size,
            genre,
            fromYear,
            toYear,
            musicFolderId
        )
    }.randomSongs.song

    suspend fun getSongsByGenre(
        genre: String,
        count: Int? = null,
        offset: Int? = null,
        musicFolderId: Int? = null
    ) = call {
        client.getSongsByGenre(
            getParams(),
            genre,
            count,
            offset,
            musicFolderId
        )
    }.songsByGenre.song

    suspend fun getNowPlaying() = call {
        client.getNowPlaying(getParams())
    }.nowPlaying.entry

    suspend fun getStarred(musicFolderId: Int? = null) = call {
        client.getStarred(getParams(), musicFolderId)
    }.starred

    suspend fun getStarred2(musicFolderId: Int? = null) = call {
        client.getStarred2(getParams(), musicFolderId)
    }.starred2
}