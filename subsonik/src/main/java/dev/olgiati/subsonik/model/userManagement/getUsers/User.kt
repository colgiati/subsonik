package dev.olgiati.subsonik.model.userManagement.getUsers

data class User(
    val adminRole: Boolean,
    val commentRole: Boolean,
    val coverArtRole: Boolean,
    val downloadRole: Boolean,
    val jukeboxRole: Boolean,
    val playlistRole: Boolean,
    val podcastRole: Boolean,
    val scrobblingEnabled: Boolean,
    val settingsRole: Boolean,
    val shareRole: Boolean,
    val streamRole: Boolean,
    val uploadRole: Boolean,
    val username: String,
    val videoConversionRole: Boolean
)
