package dev.olgiati.subsonik.model.response.browsing

import dev.olgiati.subsonik.model._base.SubsonicError
import dev.olgiati.subsonik.model.folder.MusicFolders
import dev.olgiati.subsonik.model._base.SubsonicResponse

class GetMusicFoldersResponse(
    val musicFolders: MusicFolders,
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

