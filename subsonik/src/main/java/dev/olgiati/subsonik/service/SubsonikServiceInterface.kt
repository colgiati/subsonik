package dev.olgiati.subsonik.service

import dev.olgiati.subsonik.api.Api
import dev.olgiati.subsonik.model._base.SubsonicDTO
import dev.olgiati.subsonik.model._base.SubsonicResponse

internal interface SubsonikServiceInterface {
    var client: Api
    var preferences: SubsonikPreferences

    fun getParams(): Map<String, String>

    suspend fun <T : SubsonicResponse> call(apiCall: suspend () -> SubsonicDTO<T>): T {
        val response = apiCall()
        if (response.response.error != null) {
            println(response.response.error)
            throw SubsonikException(response.response.error)
        }
        return response.response
    }
}