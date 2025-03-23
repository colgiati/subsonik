package dev.olgiati.subsonik.model.share

import dev.olgiati.subsonik.model.Child
import java.util.Date

data class Share(
    val id: String,
    val url: String,
    val description: String?,
    val username: String,
    val created: String,
    val expires: String?,
    val lastVisited: Date?,
    val visitCount: Int,
    val entry: List<Child>?
)