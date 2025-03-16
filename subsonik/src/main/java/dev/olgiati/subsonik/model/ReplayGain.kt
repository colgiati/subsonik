package dev.olgiati.subsonik.model

data class ReplayGain(
    val trackGain: Double?,
    val albumGain: Double?,
    val trackPeak: Double?,
    val albumPeak: Double?,
    val baseGain: Double?,
    val fallbackGain: Double?,
)