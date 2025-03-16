package dev.olgiati.subsonik.model.response.albumSongLists

import com.google.gson.annotations.SerializedName
import dev.olgiati.subsonik.model._base.SubsonicError
import dev.olgiati.subsonik.model._base.SubsonicResponse
import dev.olgiati.subsonik.model.album.AlbumList

class GetAlbumListResponse(
    @SerializedName("albumList", alternate = ["albumList2"])
    val albumList: AlbumList,
    status: String,
    version: String,
    type: String,
    serverVersion: String,
    openSubsonic: Boolean,
    error: SubsonicError?
) : SubsonicResponse(
    status = status,
    version = version,
    type = type,
    serverVersion = serverVersion,
    openSubsonic = openSubsonic,
    error = error
)
