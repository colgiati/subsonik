package dev.olgiati.subsonik.model.podcast

data class PodcastChannel(
    val id: String,
    val url: String,
    val title: String?,
    val description: String?,
    val coverArt: String?,
    val originalImageUrl: String?,
    val status: PodcastStatus,
    val errorMessage: String?,
    val episode: List<PodcastEpisode>?,
)
