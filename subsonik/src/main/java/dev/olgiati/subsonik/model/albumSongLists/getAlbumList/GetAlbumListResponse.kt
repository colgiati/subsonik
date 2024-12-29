package dev.olgiati.subsonik.model.albumSongLists.getAlbumList

import com.google.gson.annotations.SerializedName
import dev.olgiati.subsonik.model.SubsonicResponse

class GetAlbumListResponse(
    @SerializedName("albumList", alternate = ["albumList2"])
    val albumList: AlbumList
) : SubsonicResponse()
