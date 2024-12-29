package dev.olgiati.subsonik.model.bookmarks.getBookmarks

data class Bookmark(
    val changed: String,
    val comment: String,
    val created: String,
    val entry: Entry,
    val position: Int,
    val username: String
)
