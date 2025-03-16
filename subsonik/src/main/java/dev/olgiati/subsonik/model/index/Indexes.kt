package dev.olgiati.subsonik.model.index

import dev.olgiati.subsonik.model.Child
import dev.olgiati.subsonik.model.artist.Artist

data class Indexes(
    val ignoredArticles: String,
    val lastModified: Long,
    val shortcut: List<Artist>?,
    val child: List<Child>?,
    val index: List<Index>?
)