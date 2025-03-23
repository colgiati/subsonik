package dev.olgiati.subsonik.model.response.albumSongLists

import dev.olgiati.subsonik.model._base.SubsonicError
import dev.olgiati.subsonik.model._base.SubsonicResponse
import dev.olgiati.subsonik.model.search.SearchResult3

class GetStarred2Response(
    val starred2: SearchResult3,
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