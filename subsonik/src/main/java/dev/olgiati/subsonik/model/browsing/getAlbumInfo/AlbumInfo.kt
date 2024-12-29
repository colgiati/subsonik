package dev.olgiati.subsonik.model.browsing.getAlbumInfo

data class AlbumInfo(
    val largeImageUrl: String,
    val lastFmUrl: String,
    val mediumImageUrl: String,
    val musicBrainzId: String?,
    val notes: String,
    val smallImageUrl: String
)
