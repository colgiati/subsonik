package dev.olgiati.subsonik.model.artist

import dev.olgiati.subsonik.model.index.IndexID3

data class ArtistsID3(
    val ignoredArticles: String,
    val index: List<IndexID3>?,
)
