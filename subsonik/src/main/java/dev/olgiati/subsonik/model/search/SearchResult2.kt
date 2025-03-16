package dev.olgiati.subsonik.model.search

import dev.olgiati.subsonik.model.Child
import dev.olgiati.subsonik.model.artist.Artist

data class SearchResult2(
    val artist: List<Artist>?,
    val album: List<Child>?,
    val song: List<Child>?,
)