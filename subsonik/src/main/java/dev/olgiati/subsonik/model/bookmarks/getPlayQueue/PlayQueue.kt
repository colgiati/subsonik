package dev.olgiati.subsonik.model.bookmarks.getPlayQueue

data class PlayQueue(
    val changed: String,
    val changedBy: String,
    val current: String,
    val entry: List<Entry>,
    val position: Int,
    val username: String
)
