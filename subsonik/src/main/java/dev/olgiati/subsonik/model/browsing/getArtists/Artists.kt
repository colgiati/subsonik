package dev.olgiati.subsonik.model.browsing.getArtists

data class Artists(
    val ignoredArticles: String,
    val index: List<Index>,
    val lastModified: Long
)
