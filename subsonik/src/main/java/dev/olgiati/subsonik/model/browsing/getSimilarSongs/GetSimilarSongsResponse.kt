package dev.olgiati.subsonik.model.browsing.getSimilarSongs

import com.google.gson.annotations.SerializedName
import dev.olgiati.subsonik.model.SubsonicResponse

class GetSimilarSongsResponse(
    @SerializedName("similarSongs", alternate = ["similarSongs2"])
    val similarSongs: SimilarSongs
) : SubsonicResponse()
