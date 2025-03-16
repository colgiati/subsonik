package dev.olgiati.subsonik.model.album

import dev.olgiati.subsonik.model.Child
import dev.olgiati.subsonik.model.DiscTitle
import dev.olgiati.subsonik.model.ItemDate
import dev.olgiati.subsonik.model.RecordLabel
import dev.olgiati.subsonik.model.artist.ArtistsID3
import dev.olgiati.subsonik.model.genre.ItemGenre
import java.util.Date

class AlbumID3WithSongs(
    id: String,
    name: String,
    version: String?,
    artist: String?,
    artistId: String?,
    coverArt: String?,
    songCount: Int,
    duration: Int,
    playCount: Int?,
    created: Date,
    starred: Date?,
    year: Int?,
    genre: String?,
    played: Date?,
    userRating: Int?,
    recordLabels: List<RecordLabel>?,
    musicBrainzId: String?,
    genres: List<ItemGenre>?,
    artists: List<ArtistsID3>?,
    displayArtist: String?,
    releaseTypes: List<String>?,
    moods: List<String>?,
    sortName: String?,
    originalReleaseDate: ItemDate?,
    releaseDate: ItemDate?,
    isCompilation: Boolean?,
    explicitStatus: String?,
    discTitles: List<DiscTitle>?,
    val song: List<Child>,
) : AlbumID3(
    id,
    name,
    version,
    artist,
    artistId,
    coverArt,
    songCount,
    duration,
    playCount,
    created,
    starred,
    year,
    genre,
    played,
    userRating,
    recordLabels,
    musicBrainzId,
    genres,
    artists,
    displayArtist,
    releaseTypes,
    moods,
    sortName,
    originalReleaseDate,
    releaseDate,
    isCompilation,
    explicitStatus,
    discTitles
)