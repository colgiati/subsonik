package dev.olgiati.subsonik.model.browsing.getArtistInfo

data class ArtistInfo(
    val biography: String,
    val largeImageUrl: String,
    val lastFmUrl: String,
    val mediumImageUrl: String,
    val musicBrainzId: String,
    val similarArtist: List<SimilarArtist>,
    val smallImageUrl: String
)
