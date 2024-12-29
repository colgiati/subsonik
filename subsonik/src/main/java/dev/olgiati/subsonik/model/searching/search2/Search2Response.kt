package dev.olgiati.subsonik.model.searching.search2

import com.google.gson.annotations.SerializedName
import dev.olgiati.subsonik.model.SubsonicResponse

class Search2Response(
    @SerializedName("searchResult2")
    val searchResult: SearchResult
) : SubsonicResponse()
