package dev.olgiati.subsonik.service

internal interface SharingService : SubsonikServiceInterface {
    suspend fun getShares() = call {
        client.getShares(getParams())
    }.shares.share

    suspend fun createShare(id: String, description: String? = null, expires: Int? = null) = call {
        client.createShare(
            getParams(),
            id,
            description,
            expires
        )
    }.shares.share

    suspend fun updateShare(id: String, description: String? = null, expires: Int? = null) = call {
        client.updateShare(getParams(), id, description, expires)
    }

    suspend fun deleteShare(id: String) = call {
        client.deleteShare(getParams(), id)
    }
}