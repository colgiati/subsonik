package dev.olgiati.subsonik.service

internal interface PlaylistsService : SubsonikServiceInterface {
    suspend fun getPlaylists(username: String? = null) = call {
        client.getPlaylists(getParams(), username)
    }.playlists.playlist

    suspend fun getPlaylist(id: String) = call {
        client.getPlaylist(getParams(), id)
    }.playlist

    suspend fun createPlaylist(
        playlistId: String? = null,
        name: String? = null,
        songId: Array<String>? = null
    ) = call {
        client.createPlaylist(getParams(), playlistId, name, songId)
    }.playlist

    suspend fun updatePlaylist(
        playlistId: String,
        name: String? = null,
        comment: String? = null,
        public: Boolean? = null,
        songIdToAdd: Array<String>? = null,
        songIndexToRemove: Array<Int>? = null,
    ) = call {
        client.updatePlaylist(
            getParams(),
            playlistId,
            name,
            comment,
            public,
            songIdToAdd,
            songIndexToRemove,
        )
    }

    suspend fun deletePlaylist(id: String) = call {
        client.deletePlaylist(getParams(), id)
    }
}