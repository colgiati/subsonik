package dev.olgiati.subsonik.model.browsing.getSong

data class Song(
    val album: String,
    val albumId: String,
    val artist: String,
    val artistId: String,
    val bitRate: Int,
    val bookmarkPosition: Int,
    val bpm: Int,
    val channelCount: Int,
    val comment: String,
    val contentType: String,
    val coverArt: String,
    val created: String,
    val discNumber: Int,
    val duration: Int,
    val genre: String,
    val genres: List<Genre>,
    val id: String,
    val isDir: Boolean,
    val isVideo: Boolean,
    val mediaType: String,
    val musicBrainzId: String,
    val parent: String,
    val path: String,
    val replayGain: ReplayGain,
    val size: Int,
    val sortName: String,
    val suffix: String,
    val title: String,
    val track: Int,
    val type: String,
    val year: Int
)
