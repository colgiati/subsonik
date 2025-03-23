package dev.olgiati.subsonik.model.response.mediaLibraryScanning

import dev.olgiati.subsonik.model.ScanStatus
import dev.olgiati.subsonik.model._base.SubsonicError
import dev.olgiati.subsonik.model._base.SubsonicResponse

class GetScanStatusResponse(
    val scanStatus: ScanStatus,
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
