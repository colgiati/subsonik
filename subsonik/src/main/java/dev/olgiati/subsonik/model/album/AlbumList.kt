package dev.olgiati.subsonik.model.album

import dev.olgiati.subsonik.model.Child

data class AlbumList(val album: List<Child>?)

data class AlbumList2(val album: List<AlbumID3>?)