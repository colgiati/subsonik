package dev.olgiati.subsonik.model.artist

data class Contributor(
    val role: String,
    val subRole: String?,
    val artist: ArtistID3
)