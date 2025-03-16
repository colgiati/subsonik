package dev.olgiati.subsonik.model.response.playlists

import dev.olgiati.subsonik.model._base.SubsonicError
import dev.olgiati.subsonik.model._base.SubsonicResponse
import dev.olgiati.subsonik.model.playlist.PlaylistWithSongs

class GetPlaylistResponse(
    val playlist: PlaylistWithSongs,
    status: String,
    version: String,
    type: String,
    serverVersion: String,
    openSubsonic: Boolean,
    error: SubsonicError?
) : SubsonicResponse(
    status = status,
    version = version,
    type = type,
    serverVersion = serverVersion,
    openSubsonic = openSubsonic,
    error = error
)
