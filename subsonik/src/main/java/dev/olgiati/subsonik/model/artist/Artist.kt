package dev.olgiati.subsonik.model.artist

import dev.olgiati.subsonik.model.album.AlbumID3
import java.util.Date

data class Artist(
    val id: String,
    val name: String,
    val artistImageUrl: String?,
    val starred: Date?,
    val userRating: Int?,
    val averageRating: Double?,
    val album: List<AlbumID3>?,
)