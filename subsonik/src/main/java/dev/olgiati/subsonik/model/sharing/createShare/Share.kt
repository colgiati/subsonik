package dev.olgiati.subsonik.model.sharing.createShare

data class Share(
    val created: String,
    val description: String,
    val entry: List<Entry>,
    val expires: String,
    val id: String,
    val lastVisited: String,
    val url: String,
    val username: String,
    val visitCount: Int
)
