package dev.olgiati.subsonik.api

import dev.olgiati.subsonik.model.SignInRequest
import dev.olgiati.subsonik.model.SignInResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface Api :
    SystemApi,
    BrowsingApi,
    AlbumSongListsApi,
    SearchApi,
    PlaylistsApi,
    MediaRetrievalApi,
    MediaAnnotationApi,
    SharingApi,
    InternetRadioApi,
    UserManagementApi,
    BookmarksApi,
    MediaLibraryScanningApi {
    @POST("/auth/login")
    fun signIn(@Body body: SignInRequest): Call<SignInResponse>
}
