package dev.olgiati.subsonik.service

internal interface UserManagementService : SubsonikServiceInterface {
    suspend fun getUser(username: String) = call {
        client.getUser(getParams(), username)
    }.user

    suspend fun getUsers() = call { client.getUsers(getParams()) }.users.user

    suspend fun createUser(
        username: String,
        password: String,
        email: String,
        ldapAuthenticated: Boolean? = null,
        adminRole: Boolean? = null,
        settingsRole: Boolean? = null,
        streamRole: Boolean? = null,
        jukeboxRole: Boolean? = null,
        downloadRole: Boolean? = null,
        uploadRole: Boolean? = null,
        playlistRole: Boolean? = null,
        coverArtRole: Boolean? = null,
        commentRole: Boolean? = null,
        podcastRole: Boolean? = null,
        shareRole: Boolean? = null,
        videoConversionRole: Boolean? = null,
        musicFolderId: Array<Int>? = null,
    ) = call {
        client.createUser(
            getParams(),
            username,
            password,
            email,
            ldapAuthenticated,
            adminRole,
            settingsRole,
            streamRole,
            jukeboxRole,
            downloadRole,
            uploadRole,
            playlistRole,
            coverArtRole,
            commentRole,
            podcastRole,
            shareRole,
            videoConversionRole,
            musicFolderId,
        )
    }

    suspend fun updateUser(
        username: String,
        password: String,
        email: String,
        ldapAuthenticated: Boolean? = null,
        adminRole: Boolean? = null,
        settingsRole: Boolean? = null,
        streamRole: Boolean? = null,
        jukeboxRole: Boolean? = null,
        downloadRole: Boolean? = null,
        uploadRole: Boolean? = null,
        coverArtRole: Boolean? = null,
        commentRole: Boolean? = null,
        podcastRole: Boolean? = null,
        shareRole: Boolean? = null,
        videoConversionRole: Boolean? = null,
        musicFolderId: Array<Int>? = null,
        maxBitRate: Int? = null
    ) = call {
        client.updateUser(
            getParams(),
            username,
            password,
            email,
            ldapAuthenticated,
            adminRole,
            settingsRole,
            streamRole,
            jukeboxRole,
            downloadRole,
            uploadRole,
            coverArtRole,
            commentRole,
            podcastRole,
            shareRole,
            videoConversionRole,
            musicFolderId,
            maxBitRate,
        )
    }

    suspend fun deleteUser(username: String) = call {
        client.deleteUser(getParams(), username)
    }

    suspend fun changePassword(username: String, password: String) = call {
        client.changePassword(getParams(), username, password)
    }
}