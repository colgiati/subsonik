package dev.olgiati.subsonik

import dev.olgiati.subsonik.api.Api
import dev.olgiati.subsonik.model.SignInRequest
import dev.olgiati.subsonik.model.SignInResponse
import dev.olgiati.subsonik.model.SubsonicResponse
import retrofit2.Retrofit
import retrofit2.create
import java.util.Date


class SubsonikService(builder: Retrofit.Builder, private var preferences: SubsonikPreferences) {
    private var retrofit: Retrofit = builder.apply {
        baseUrl(preferences.client)
    }.build()

    @Override
    fun updatePreferences(preferences: SubsonikPreferences) {
        this.preferences = preferences
        retrofit = retrofit.newBuilder().apply {
            baseUrl(preferences.client)
        }.build()
        client = retrofit.create<Api>()
    }

    private var client = retrofit.create<Api>()

    suspend fun ping() = client.ping(preferences.getParams()).response

    suspend fun getLicense() = client.getLicense(preferences.getParams()).response.license

    suspend fun getMusicFolders() =
        client.getMusicFolders(preferences.getParams()).response.musicFolders

    suspend fun getIndexes(musicFolderId: Int? = null, ifModifiedSince: Date? = null) =
        client.getIndexes(preferences.getParams(), musicFolderId, ifModifiedSince).response.indexes

    suspend fun getMusicDirectory(id: String) =
        client.getMusicDirectory(preferences.getParams(), id).response.directory

    suspend fun getGenres() = client.getGenres(preferences.getParams()).response.genres

    suspend fun getArtists(musicFolderId: Int? = null) =
        client.getArtists(preferences.getParams(), musicFolderId).response.artists

    suspend fun getArtist(id: String) =
        client.getArtist(preferences.getParams(), id).response.artist

    suspend fun getAlbum(id: String) = client.getAlbum(preferences.getParams(), id).response.album

    suspend fun getSong(id: String) = client.getSong(preferences.getParams(), id).response.song

    suspend fun getArtistInfo(id: String, count: Int? = null, includeNotPresent: Boolean? = null) =
        client.getArtistInfo(
            preferences.getParams(),
            id,
            count,
            includeNotPresent
        ).response.artistInfo

    suspend fun getArtistInfo2(id: String, count: Int? = null, includeNotPresent: Boolean? = null) =
        client.getArtistInfo2(
            preferences.getParams(),
            id,
            count,
            includeNotPresent
        ).response.artistInfo

    suspend fun getAlbumInfo(id: String) =
        client.getAlbumInfo(preferences.getParams(), id).response.albumInfo

    suspend fun getAlbumInfo2(id: String) =
        client.getAlbumInfo2(preferences.getParams(), id).response.albumInfo

    suspend fun getSimilarSongs(id: String, count: Int? = null) =
        client.getSimilarSongs(preferences.getParams(), id, count).response.similarSongs


    suspend fun getSimilarSongs2(id: String, count: Int? = null) =
        client.getSimilarSongs2(preferences.getParams(), id, count).response.similarSongs

    suspend fun getTopSongs(artist: String, count: Int? = null) =
        client.getTopSongs(preferences.getParams(), artist, count).response.topSongs

    suspend fun getAlbumList(
        type: String,
        size: Int? = null,
        offset: Int? = null,
        fromYear: Int? = null,
        toYear: Int? = null,
        genre: String? = null,
        musicFolderId: Int? = null
    ) = client.getAlbumList(
        preferences.getParams(),
        type,
        size,
        offset,
        fromYear,
        toYear,
        genre,
        musicFolderId
    ).response.albumList

    suspend fun getAlbumList2(
        type: String = "alphabeticalByName",
        size: Int? = null,
        offset: Int? = null,
        fromYear: Int? = null,
        toYear: Int? = null,
        genre: String? = null,
        musicFolderId: Int? = null
    ) = client.getAlbumList2(
        preferences.getParams(),
        type,
        size,
        offset,
        fromYear,
        toYear,
        genre,
        musicFolderId
    ).response.albumList

    suspend fun getRandomSongs(
        size: Int? = null,
        genre: String? = null,
        fromYear: Int? = null,
        toYear: Int? = null,
        musicFolderId: Int? = null,
    ) = client.getRandomSongs(
        preferences.getParams(),
        size,
        genre,
        fromYear,
        toYear,
        musicFolderId
    ).response.randomSongs

    suspend fun getSongsByGenre(
        genre: String,
        count: Int? = null,
        offset: Int? = null,
        musicFolderId: Int? = null
    ) = client.getSongsByGenre(
        preferences.getParams(),
        genre,
        count,
        offset,
        musicFolderId
    ).response.songsByGenre

    suspend fun getNowPlaying() = client.getNowPlaying(preferences.getParams()).response.nowPlaying

    suspend fun getStarred(musicFolderId: Int? = null) =
        client.getStarred(preferences.getParams(), musicFolderId).response.starred

    suspend fun getStarred2(musicFolderId: Int? = null) =
        client.getStarred2(preferences.getParams(), musicFolderId).response.starred

    suspend fun search2(
        query: String,
        artistCount: Int? = null,
        artistOffset: Int? = null,
        albumCount: Int? = null,
        albumOffset: Int? = null,
        songCount: Int? = null,
        songOffset: Int? = null
    ) = client.search2(
        preferences.getParams(),
        query,
        artistCount,
        artistOffset,
        albumCount,
        albumOffset,
        songCount,
        songOffset,
    ).response.searchResult

    suspend fun search3(
        query: String,
        artistCount: Int? = null,
        artistOffset: Int? = null,
        albumCount: Int? = null,
        albumOffset: Int? = null,
        songCount: Int? = null,
        songOffset: Int? = null
    ) = client.search3(
        preferences.getParams(),
        query,
        artistCount,
        artistOffset,
        albumCount,
        albumOffset,
        songCount,
        songOffset,
    ).response.searchResult

    suspend fun getPlaylists(username: String? = null) =
        client.getPlaylists(preferences.getParams(), username).response.playlists

    suspend fun getPlaylist(id: String) =
        client.getPlaylist(preferences.getParams(), id).response.playlist

    suspend fun createPlaylist(
        playlistId: String? = null,
        name: String? = null,
        songId: Array<String>? = null
    ) =
        client.createPlaylist(preferences.getParams(), playlistId, name, songId).response.playlist

    suspend fun updatePlaylist(
        playlistId: String,
        name: String? = null,
        comment: String? = null,
        public: Boolean? = null,
        songIdToAdd: Array<String>? = null,
        songIndexToRemove: Array<Int>? = null,
    ) =
        client.updatePlaylist(
            preferences.getParams(),
            playlistId,
            name,
            comment,
            public,
            songIdToAdd,
            songIndexToRemove,
        ).response

    suspend fun deletePlaylist(id: String) =
        client.deletePlaylist(preferences.getParams(), id).response

    suspend fun star(id: String? = null, albumId: String? = null, artistId: String? = null) =
        client.star(preferences.getParams(), id, albumId, artistId).response

    suspend fun unstar(id: String? = null, albumId: String? = null, artistId: String? = null) =
        client.unstar(preferences.getParams(), id, albumId, artistId).response

    suspend fun setRating(id: String, rating: Int) =
        client.setRating(preferences.getParams(), id, rating).response

    suspend fun scrobble(id: String, time: Int? = null, submission: Boolean? = null) =
        client.scrobble(preferences.getParams(), id, time, submission).response

    suspend fun getShares() = client.getShares(preferences.getParams()).response.shares

    suspend fun createShare(id: String, description: String? = null, expires: Int? = null) =
        client.createShare(
            preferences.getParams(),
            id,
            description,
            expires
        ).response.shares.share.first()

    suspend fun updateShare(id: String, description: String? = null, expires: Int? = null) =
        client.updateShare(preferences.getParams(), id, description, expires).response

    suspend fun deleteShare(id: String) = client.deleteShare(preferences.getParams(), id).response

    suspend fun getInternetRadioStations() =
        client.getInternetRadioStations(preferences.getParams()).response.internetRadioStations

    suspend fun createInternetRadioStation(
        streamUrl: String,
        name: String,
        homepageUrl: String? = null
    ) =
        client.createInternetRadioStation(
            preferences.getParams(),
            streamUrl,
            name,
            homepageUrl
        ).response

    suspend fun updateInternetRadioStation(
        id: String,
        streamUrl: String,
        name: String,
        homepageUrl: String? = null
    ) =
        client.updateInternetRadioStation(
            preferences.getParams(),
            id,
            streamUrl,
            name,
            homepageUrl
        ).response

    suspend fun deleteInternetRadioStation(id: String) =
        client.deleteInternetRadioStation(preferences.getParams(), id).response

    suspend fun getUsers() = client.getUsers(preferences.getParams()).response.users

    suspend fun createUser(
        username: String,
        password: String,
        email: String,
        ldapAuthenticated: Boolean? = null,
        adminRole: Boolean? = null,
        settingsRole: Boolean? = null,
        streamRole: Boolean? = null,
        jukeboxRole: Boolean? = null,
        downloadRole: Boolean? = null,
        uploadRole: Boolean? = null,
        playlistRole: Boolean? = null,
        coverArtRole: Boolean? = null,
        commentRole: Boolean? = null,
        podcastRole: Boolean? = null,
        shareRole: Boolean? = null,
        videoConversionRole: Boolean? = null,
        musicFolderId: Array<Int>? = null,
    ) = client.createUser(
        preferences.getParams(),
        username,
        password,
        email,
        ldapAuthenticated,
        adminRole,
        settingsRole,
        streamRole,
        jukeboxRole,
        downloadRole,
        uploadRole,
        playlistRole,
        coverArtRole,
        commentRole,
        podcastRole,
        shareRole,
        videoConversionRole,
        musicFolderId,
    ).response

    suspend fun updateUser(
        username: String,
        password: String,
        email: String,
        ldapAuthenticated: Boolean? = null,
        adminRole: Boolean? = null,
        settingsRole: Boolean? = null,
        streamRole: Boolean? = null,
        jukeboxRole: Boolean? = null,
        downloadRole: Boolean? = null,
        uploadRole: Boolean? = null,
        coverArtRole: Boolean? = null,
        commentRole: Boolean? = null,
        podcastRole: Boolean? = null,
        shareRole: Boolean? = null,
        videoConversionRole: Boolean? = null,
        musicFolderId: Array<Int>? = null,
        maxBitRate: Int? = null
    ) = client.updateUser(
        preferences.getParams(),
        username,
        password,
        email,
        ldapAuthenticated,
        adminRole,
        settingsRole,
        streamRole,
        jukeboxRole,
        downloadRole,
        uploadRole,
        coverArtRole,
        commentRole,
        podcastRole,
        shareRole,
        videoConversionRole,
        musicFolderId,
        maxBitRate,
    ).response

    suspend fun deleteUser(username: String) =
        client.deleteUser(preferences.getParams(), username).response

    suspend fun changePassword(username: String, password: String) =
        client.changePassword(preferences.getParams(), username, password).response

    suspend fun getBookmarks() = client.getBookmarks(preferences.getParams()).response.bookmarks

    suspend fun createBookmark(id: String, position: Int, comment: String? = null) =
        client.createBookmark(preferences.getParams(), id, position, comment).response

    suspend fun deleteBookmark(id: String) =
        client.deleteBookmark(preferences.getParams(), id).response

    suspend fun getPlayQueue() = client.getPlayQueue(preferences.getParams()).response.playQueue

    suspend fun savePlayQueue(id: Array<String>, current: String? = null, position: Int? = null) =
        client.savePlayQueue(preferences.getParams(), id, current, position).response

    suspend fun getScanStatus() = client.getScanStatus(preferences.getParams()).response.scanStatus

    suspend fun startScan() = client.startScan(preferences.getParams()).response.scanStatus

    suspend fun getCoverArt(id: String, size: Int? = null) =
        client.getCoverArt(preferences.getParams(), id, size)

    suspend fun stream(
        id: String,
        maxBitRate: Int? = null,
        format: String? = null,
        timeOffset: Int? = null,
        size: Int? = null,
        estimateContentLength: Boolean? = null,
        converted: Boolean? = null,
    ) =
        client.stream(
            preferences.getParams(),
            id,
            maxBitRate,
            format,
            timeOffset,
            size,
            estimateContentLength,
            converted,
        )

    fun getCoverArtURL(id: String, size: Int? = null): String {
        val base = "${preferences.client}/rest/getCoverArt"
        val defaultParams = preferences.getParams()
            .map { "${it.key}=${it.value}" }
            .foldRight("") { a, c -> "$a&$c" }
        val params = "$defaultParams&id=$id&size=$size"
        return "$base?$params"
    }

    fun streamURL(
        id: String,
        maxBitRate: Int? = null,
        format: String? = null,
        timeOffset: Int? = null,
        size: Int? = null,
        estimateContentLength: Boolean? = null,
        converted: Boolean? = null,
    ): String {
        val base = "${preferences.client}/rest/stream"
        val defaultParams = preferences.getParams()
            .map { "${it.key}=${it.value}" }
            .foldRight("") { a, c -> "$a&$c" }
        val params = defaultParams +
                "&id=$id" +
                "&maxBitRate=$maxBitRate" +
                "&format=$format" +
                "&timeOffset=$timeOffset" +
                "&size=$size" +
                "&estimateContentLength=$estimateContentLength" +
                "&converted=$converted"
        return "$base?$params"
    }

    fun signIn(username: String, password: String): SignInResponse {
        val request = SignInRequest(username, password)
        return client.signIn(request).execute().body()!!
    }

    private suspend fun makeCall(call: suspend () -> SubsonicResponse): SubsonicResponse {
        val response = call()
        if (response.status == "ok") return response
        throw Exception()
    }
}
