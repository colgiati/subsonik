package dev.olgiati.subsonik.model.lyrics

data class StructuredLyrics(
    val lang: String,
    val synced: Boolean,
    val line: List<Line>,
    val displayArtist: String?,
    val displayTitle: String?,
    val offset: Double?,
)