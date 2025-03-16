package dev.olgiati.subsonik.model.response.bookmarks

import dev.olgiati.subsonik.model.PlayQueue
import dev.olgiati.subsonik.model._base.SubsonicError
import dev.olgiati.subsonik.model._base.SubsonicResponse

class GetPlayQueueResponse(
    val playQueue: PlayQueue, status: String,
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

