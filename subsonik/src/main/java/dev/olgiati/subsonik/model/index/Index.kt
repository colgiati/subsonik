package dev.olgiati.subsonik.model.index

import dev.olgiati.subsonik.model.artist.Artist

data class Index(
    val name: String,
    val artist: List<Artist>?
)

typealias IndexID3 = Index