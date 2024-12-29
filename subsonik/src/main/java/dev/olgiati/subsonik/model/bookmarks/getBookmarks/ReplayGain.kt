package dev.olgiati.subsonik.model.bookmarks.getBookmarks

data class ReplayGain(
    val albumGain: Double,
    val albumPeak: Double,
    val trackGain: Double,
    val trackPeak: Double
)
