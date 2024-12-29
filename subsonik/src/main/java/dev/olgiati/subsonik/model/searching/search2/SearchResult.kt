package dev.olgiati.subsonik.model.searching.search2

data class SearchResult(
    val album: List<Album>,
    val artist: List<Artist>,
    val song: List<Song>
)
