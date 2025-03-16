package dev.olgiati.subsonik.model.artist

abstract class BaseArtistInfo(
    val biography: String?,
    val musicBrainzId: String?,
    val lastFmUrl: String?,
    val smallImageUrl: String?,
    val mediumImageUrl: String?,
    val largeImageUrl: String?,
)

class ArtistInfo(
    biography: String?,
    musicBrainzId: String?,
    lastFmUrl: String?,
    smallImageUrl: String?,
    mediumImageUrl: String?,
    largeImageUrl: String?,
    val similarArtist: List<Artist>?,
) : BaseArtistInfo(
    biography,
    musicBrainzId,
    lastFmUrl,
    smallImageUrl,
    mediumImageUrl,
    largeImageUrl,
)

class ArtistInfo2(
    biography: String?,
    musicBrainzId: String?,
    lastFmUrl: String?,
    smallImageUrl: String?,
    mediumImageUrl: String?,
    largeImageUrl: String?,
    val similarArtist: List<ArtistsID3>?,
) : BaseArtistInfo(
    biography,
    musicBrainzId,
    lastFmUrl,
    smallImageUrl,
    mediumImageUrl,
    largeImageUrl,
)

