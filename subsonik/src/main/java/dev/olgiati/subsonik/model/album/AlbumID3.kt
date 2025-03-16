package dev.olgiati.subsonik.model.album

import dev.olgiati.subsonik.model.DiscTitle
import dev.olgiati.subsonik.model.ItemDate
import dev.olgiati.subsonik.model.RecordLabel
import dev.olgiati.subsonik.model.artist.ArtistsID3
import dev.olgiati.subsonik.model.genre.ItemGenre
import java.util.Date

open class AlbumID3(
    val id: String,
    val name: String,
    val version: String?,
    val artist: String?,
    val artistId: String?,
    val coverArt: String?,
    val songCount: Int,
    val duration: Int,
    val playCount: Int?,
    val created: Date,
    val starred: Date?,
    val year: Int?,
    val genre: String?,
    val played: Date?,
    val userRating: Int?,
    val recordLabels: List<RecordLabel>?,
    val musicBrainzId: String?,
    val genres: List<ItemGenre>?,
    val artists: List<ArtistsID3>?,
    val displayArtist: String?,
    val releaseTypes: List<String>?,
    val moods: List<String>?,
    val sortName: String?,
    val originalReleaseDate: ItemDate?,
    val releaseDate: ItemDate?,
    val isCompilation: Boolean?,
    val explicitStatus: String?,
    val discTitles: List<DiscTitle>?,
)