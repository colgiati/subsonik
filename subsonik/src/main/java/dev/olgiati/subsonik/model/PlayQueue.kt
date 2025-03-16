package dev.olgiati.subsonik.model

import java.util.Date

data class PlayQueue(
    val current: String?,
    val position: Long?,
    val username: String,
    val changed: Date,
    val changedBy: String,
    val entry: List<Child>
)