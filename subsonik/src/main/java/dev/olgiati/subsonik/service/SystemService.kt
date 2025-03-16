package dev.olgiati.subsonik.service

internal interface SystemService : SubsonikServiceInterface {
    suspend fun ping() = call { client.ping(getParams()) }

    suspend fun getLicense() = call { client.getLicense(getParams()) }.license

    suspend fun getOpenSubsonicExtensions() = call {
        client.getOpenSubsonicExtensions(getParams())
    }.openSubsonicExtensions

    suspend fun tokenInfo(apiKey: String) = call {
        client.tokenInfo(getParams(), apiKey)
    }.tokenInfo
}