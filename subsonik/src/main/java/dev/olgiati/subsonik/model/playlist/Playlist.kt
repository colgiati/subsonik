package dev.olgiati.subsonik.model.playlist

import java.util.Date

open class Playlist(
    val id: String,
    val name: String,
    val comment: String?,
    val owner: String?,
    val `public`: Boolean?,
    val songCount: Int,
    val duration: Int,
    val created: Date,
    val changed: Date,
    val coverArt: String?,
    val allowedUser: List<String>?,
)
