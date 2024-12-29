package dev.olgiati.subsonik.model.browsing.getAlbum

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
    val releaseDate: ReleaseDate,
    val song: List<Song>,
    val songCount: Int,
    val sortName: String,
    val userRating: Int,
    val year: Int
)
