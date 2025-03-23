package dev.olgiati.subsonik.service

internal interface MediaRetrievalService : SubsonikServiceInterface {
    suspend fun stream(
        id: String,
        maxBitRate: Int? = null,
        format: String? = null,
        timeOffset: Int? = null,
        size: Int? = null,
        estimateContentLength: Boolean? = null,
        converted: Boolean? = null,
    ) = client.stream(
        getParams(),
        id,
        maxBitRate,
        format,
        timeOffset,
        size,
        estimateContentLength,
        converted,
    )

    suspend fun download(id: String) = client.stream(getParams(), id)

    suspend fun getCoverArt(id: String, size: Int? = null) =
        client.getCoverArt(getParams(), id, size)

    suspend fun getLyrics(artist: String? = null, title: String? = null) = call {
        client.getLyrics(getParams(), artist, title)
    }.lyrics

    suspend fun getLyricsBySongId(id: String) = call {
        client.getLyricsBySongId(getParams(), id)
    }.lyricsList

    suspend fun getAvatar(username: String) = client.getAvatar(getParams(), username)

    fun streamURL(
        id: String,
        maxBitRate: Int? = null,
        format: String? = null,
        timeOffset: Int? = null,
        size: Int? = null,
        estimateContentLength: Boolean? = null,
        converted: Boolean? = null,
    ): String {
        val base = "${client}/rest/stream"
        val defaultParams = getParams()
            .map { "${it.key}=${it.value}" }
            .foldRight("") { a, c -> "$a&$c" }
        val params = defaultParams +
                "&id=$id" +
                "&maxBitRate=$maxBitRate" +
                "&format=$format" +
                "&timeOffset=$timeOffset" +
                "&size=$size" +
                "&estimateContentLength=$estimateContentLength" +
                "&converted=$converted"
        return "$base?$params"
    }

    fun downloadURL(
        id: String,
    ): String {
        val base = "${client}/rest/download"
        val defaultParams = getParams()
            .map { "${it.key}=${it.value}" }
            .foldRight("") { a, c -> "$a&$c" }
        val params = defaultParams +
                "&id=$id"
        return "$base?$params"
    }

    fun getCoverArtURL(id: String, size: Int? = null): String {
        val base = "${client}/rest/getCoverArt"
        val defaultParams = getParams()
            .map { "${it.key}=${it.value}" }
            .foldRight("") { a, c -> "$a&$c" }
        val params = "$defaultParams&id=$id&size=$size"
        return "$base?$params"
    }
}