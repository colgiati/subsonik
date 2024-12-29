package dev.olgiati.subsonik.model.playlists

data class Playlist(
    val changed: String,
    val coverArt: String,
    val created: String,
    val duration: Int,
    val entry: List<Entry>?,
    val id: String,
    val name: String,
    val owner: String,
    val `public`: Boolean,
    val songCount: Int
)
