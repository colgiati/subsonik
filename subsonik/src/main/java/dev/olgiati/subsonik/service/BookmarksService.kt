package dev.olgiati.subsonik.service

internal interface BookmarksService : SubsonikServiceInterface {
    suspend fun getBookmarks() = call {
        client.getBookmarks(getParams())
    }.bookmarks.bookmark


    suspend fun createBookmark(id: String, position: Int, comment: String? = null) = call {
        client.createBookmark(getParams(), id, position, comment)
    }

    suspend fun deleteBookmark(id: String) = call {
        client.deleteBookmark(getParams(), id)
    }

    suspend fun getPlayQueue() = call {
        client.getPlayQueue(getParams())
    }.playQueue

    suspend fun savePlayQueue(
        id: Array<String>,
        current: String? = null,
        position: Int? = null,
    ) = call {
        client.savePlayQueue(getParams(), id, current, position)
    }
}