package dev.olgiati.subsonik.service

internal interface MediaAnnotationService : SubsonikServiceInterface {
    suspend fun star(
        id: String? = null,
        albumId: String? = null,
        artistId: String? = null
    ) = call {
        client.star(getParams(), id, albumId, artistId)
    }

    suspend fun unstar(
        id: String? = null,
        albumId: String? = null,
        artistId: String? = null
    ) = call {
        client.unstar(getParams(), id, albumId, artistId)
    }

    suspend fun setRating(id: String, rating: Int) = call {
        client.setRating(getParams(), id, rating)
    }

    suspend fun scrobble(id: String, time: Int? = null, submission: Boolean? = null) = call {
        client.scrobble(getParams(), id, time, submission)
    }
}