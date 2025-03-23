package dev.olgiati.subsonik.model.podcast

enum class PodcastStatus {
    NEW,
    DOWNLOADING,
    COMPLETED,
    ERROR,
    DELETED,
    SKIPPED;

    override fun toString() = this.name.lowercase()
}