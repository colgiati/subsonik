package dev.olgiati.subsonik.model

import com.google.gson.annotations.SerializedName

data class SubsonicDTO<T: SubsonicResponse>(
    @SerializedName("subsonic-response")
    val response: T,
)
