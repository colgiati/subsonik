package dev.olgiati.subsonik.model.browsing.getMusicDirectory

data class Directory(
    val albumCount: Int,
    val child: List<Child>,
    val id: String,
    val name: String
)
