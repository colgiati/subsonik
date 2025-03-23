package dev.olgiati.subsonik.model.podcast

import java.util.Date

data class PodcastEpisode(
    val streamId: String?,
    val channelId: String,
    val description: String?,
    val status: PodcastStatus,
    val publishDate: Date?,
)