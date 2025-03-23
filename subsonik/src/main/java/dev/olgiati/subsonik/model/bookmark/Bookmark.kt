package dev.olgiati.subsonik.model.bookmark

import dev.olgiati.subsonik.model.Child
import java.util.Date

data class Bookmark(
    val position: Int,
    val username: String,
    val comment: String?,
    val created: Date,
    val changed: Date,
    val entry: Child
)