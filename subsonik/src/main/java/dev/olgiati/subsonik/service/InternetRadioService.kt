package dev.olgiati.subsonik.service

internal interface InternetRadioService : SubsonikServiceInterface {
    suspend fun getInternetRadioStations() = call {
        client.getInternetRadioStations(
            getParams()
        )
    }.internetRadioStations.internetRadioStation

    suspend fun createInternetRadioStation(
        streamUrl: String,
        name: String,
        homepageUrl: String? = null
    ) = call {
        client.createInternetRadioStation(
            getParams(),
            streamUrl,
            name,
            homepageUrl
        )
    }

    suspend fun updateInternetRadioStation(
        id: String,
        streamUrl: String,
        name: String,
        homepageUrl: String? = null
    ) = call {
        client.updateInternetRadioStation(
            getParams(),
            id,
            streamUrl,
            name,
            homepageUrl
        )
    }

    suspend fun deleteInternetRadioStation(id: String) = call {
        client.deleteInternetRadioStation(getParams(), id)
    }
}