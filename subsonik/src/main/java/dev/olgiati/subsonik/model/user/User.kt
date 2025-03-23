package dev.olgiati.subsonik.model.user

import java.util.Date

data class User(
    val username: String,
    val scrobblingEnabled: Boolean,
    val maxBitRate: Int?,
    val adminRole: Boolean,
    val settingsRole: Boolean,
    val downloadRole: Boolean,
    val uploadRole: Boolean,
    val playlistRole: Boolean,
    val coverArtRole: Boolean,
    val commentRole: Boolean,
    val podcastRole: Boolean,
    val streamRole: Boolean,
    val jukeboxRole: Boolean,
    val shareRole: Boolean,
    val videoConversionRole: Boolean,
    val avatarLastChanged: Date?,
    val folder: List<Int>?,
)
