package dev.olgiati.subsonik.model.browsing.getIndexes

data class Indexes(
    val ignoredArticles: String,
    val index: List<Index>,
    val lastModified: Long
)
