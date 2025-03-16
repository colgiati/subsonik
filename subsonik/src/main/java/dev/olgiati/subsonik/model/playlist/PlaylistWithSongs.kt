package dev.olgiati.subsonik.model.playlist

import dev.olgiati.subsonik.model.Child
import java.util.Date

class PlaylistWithSongs(
    id: String,
    name: String,
    comment: String?,
    owner: String?,
    `public`: Boolean?,
    songCount: Int,
    duration: Int,
    created: Date,
    changed: Date,
    coverArt: String?,
    allowedUser: List<String>?,
    val entry: List<Child>?,
) : Playlist(
    id,
    name,
    comment,
    owner,
    `public`,
    songCount,
    duration,
    created,
    changed,
    coverArt,
    allowedUser,
)
