package dev.olgiati.subsonik.model.albumSongLists.getStarred

import com.google.gson.annotations.SerializedName
import dev.olgiati.subsonik.model.SubsonicResponse

class GetStarredResponse(
    @SerializedName("starred", alternate = ["starred2"])
    val starred: Starred
) : SubsonicResponse()
