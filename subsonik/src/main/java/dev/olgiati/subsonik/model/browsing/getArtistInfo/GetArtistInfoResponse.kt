package dev.olgiati.subsonik.model.browsing.getArtistInfo

import com.google.gson.annotations.SerializedName
import dev.olgiati.subsonik.model.SubsonicResponse

class GetArtistInfoResponse(
    @SerializedName("artistInfo", alternate = ["artistInfo2"])
    val artistInfo: ArtistInfo
) : SubsonicResponse()
