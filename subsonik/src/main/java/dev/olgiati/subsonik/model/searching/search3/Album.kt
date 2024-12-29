package dev.olgiati.subsonik.model.searching.search3

data class Album(
    val artist: String,
    val artistId: String,
    val coverArt: String,
    val created: String,
    val discTitles: List<DiscTitle>,
    val duration: Int,
    val genre: String,
    val genres: List<Genre>,
    val id: String,
    val isCompilation: Boolean,
    val musicBrainzId: String,
    val name: String,
    val originalReleaseDate: OriginalReleaseDate,
    val playCount: Int,
    val played: String,
    val releaseDate: ReleaseDate,
    val songCount: Int,
    val sortName: String,
    val userRating: Int,
    val year: Int
)
