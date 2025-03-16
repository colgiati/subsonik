package dev.olgiati.subsonik.model.folder

import dev.olgiati.subsonik.model.Child
import java.util.Date

data class Directory(
    val id: String,
    val parent: String?,
    val name: String,
    val starred: Date?,
    val userRating: Int?,
    val averageRating: Double?,
    // Only Navidrome?
    val played: Date?,
    val playCount: Long?,
    val child: List<Child>?
)