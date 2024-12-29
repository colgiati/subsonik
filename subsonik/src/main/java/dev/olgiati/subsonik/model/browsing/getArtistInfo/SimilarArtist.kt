package dev.olgiati.subsonik.model.browsing.getArtistInfo

data class SimilarArtist(
    val albumCount: Int,
    val artistImageUrl: String,
    val coverArt: String,
    val id: String,
    val name: String
)
