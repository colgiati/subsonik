package dev.olgiati.subsonik.service

import dev.olgiati.subsonik.api.Api
import dev.olgiati.subsonik.model.SignInRequest
import dev.olgiati.subsonik.model.SignInResponse
import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.create

class SubsonikService(
    builder: Builder,
    var preferences: SubsonikPreferences,
) : SystemService, BrowsingService, AlbumSongListsService, SearchingService, PlaylistsService,
    MediaRetrievalService, MediaAnnotationService, SharingService, InternetRadioService,
    UserManagementService, BookmarksService, MediaLibraryScanningService {
    var retrofit: Retrofit = builder.apply {
        baseUrl(preferences.client)
    }.build()

    override var client = retrofit.create<Api>()

    override fun getParams(): Map<String, String> = preferences.getParams()

    fun updatePreferences(preferences: SubsonikPreferences) {
        this.preferences = preferences
        retrofit = retrofit.newBuilder().apply {
            baseUrl(preferences.client)
        }.build()
        client = retrofit.create<Api>()
    }

    fun signIn(username: String, password: String): SignInResponse {
        val request = SignInRequest(username, password)
        return client.signIn(request).execute().body()!!
    }
}