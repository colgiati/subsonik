package dev.olgiati.subsonik.model.browsing.getArtists

data class Artist(
    val albumCount: Int,
    val artistImageUrl: String,
    val coverArt: String,
    val id: String,
    val name: String
)
