package dev.olgiati.subsonik.model.response.albumSongLists

enum class ListType(value: String? = null) {
    RANDOM,
    NEWEST,
    HIGHEST,
    FREQUENT,
    RECENT,
    ALPHABETICAL_BY_NAME("alphabeticalByName"),
    ALPHABETICAL_BY_ARTIST("alphabeticalByArtist"),
    STARRED,
    BY_YEAR("byYear"),
    BY_GENRE("byGenre");

    private val value: String = value ?: name.lowercase()

    override fun toString() = this.value
}