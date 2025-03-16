package dev.olgiati.subsonik.service

internal interface MediaLibraryScanningService : SubsonikServiceInterface {
    suspend fun getScanStatus() = call {
        client.getScanStatus(getParams())
    }.scanStatus

    suspend fun startScan(fullScan: Boolean? = null) = call {
        client.startScan(getParams(), fullScan)
    }.scanStatus
}