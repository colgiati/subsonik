package dev.olgiati.subsonik.model.playlists

data class ReplayGain(
    val albumGain: Int,
    val albumPeak: Int,
    val trackGain: Double,
    val trackPeak: Int
)
