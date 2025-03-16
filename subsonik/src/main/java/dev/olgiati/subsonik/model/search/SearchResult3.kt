package dev.olgiati.subsonik.model.search

import dev.olgiati.subsonik.model.Child
import dev.olgiati.subsonik.model.album.AlbumID3
import dev.olgiati.subsonik.model.artist.ArtistID3

data class SearchResult3(
    val artist: List<ArtistID3>?,
    val album: List<AlbumID3>?,
    val song: List<Child>?,
)