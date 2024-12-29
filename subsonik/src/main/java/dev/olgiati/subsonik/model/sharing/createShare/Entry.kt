package dev.olgiati.subsonik.model.sharing.createShare

data class Entry(
    val album: String,
    val artist: String,
    val artistId: String,
    val bpm: Int,
    val channelCount: Int,
    val comment: String,
    val coverArt: String,
    val created: String,
    val duration: Int,
    val genre: String,
    val genres: List<Genre>,
    val id: String,
    val isDir: Boolean,
    val isVideo: Boolean,
    val mediaType: String,
    val musicBrainzId: String,
    val name: String,
    val parent: String,
    val playCount: Int,
    val played: String,
    val replayGain: ReplayGain,
    val songCount: Int,
    val sortName: String,
    val title: String,
    val year: Int
)
