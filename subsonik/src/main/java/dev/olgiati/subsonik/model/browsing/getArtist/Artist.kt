package dev.olgiati.subsonik.model.browsing.getArtist

data class Artist(
    val album: List<Album>,
    val albumCount: Int,
    val artistImageUrl: String,
    val coverArt: String,
    val id: String,
    val name: String
)
