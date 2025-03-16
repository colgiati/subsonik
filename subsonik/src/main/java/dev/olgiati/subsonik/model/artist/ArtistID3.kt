package dev.olgiati.subsonik.model.artist

import java.util.Date

data class ArtistID3(
    val id: String,
    val name: String,
    val coverArt: String?,
    val artistImageUrl: String?,
    val albumCount: Int?,
    val starred: Date?,
    val musicBrainzId: String?,
    val sortName: String?,
    val roles: List<String>?,
)