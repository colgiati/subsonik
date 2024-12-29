import com.google.gson.annotations.SerializedName
import dev.olgiati.subsonik.model.SubsonicResponse
import dev.olgiati.subsonik.model.searching.search2.SearchResult

class Search3Response(
    @SerializedName("searchResult3")
    val searchResult: SearchResult
) : SubsonicResponse()
