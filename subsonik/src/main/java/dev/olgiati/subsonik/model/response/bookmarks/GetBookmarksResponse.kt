package dev.olgiati.subsonik.model.response.bookmarks

import dev.olgiati.subsonik.model._base.SubsonicError
import dev.olgiati.subsonik.model._base.SubsonicResponse
import dev.olgiati.subsonik.model.bookmark.Bookmarks

class GetBookmarksResponse(
    val bookmarks: Bookmarks,
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
