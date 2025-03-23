package dev.olgiati.subsonik.model.response.system

import dev.olgiati.subsonik.model.OpenSubsonicExtension
import dev.olgiati.subsonik.model._base.SubsonicError
import dev.olgiati.subsonik.model._base.SubsonicResponse

class GetOpenSubsonicExtensionsResponse(
    val openSubsonicExtensions: List<OpenSubsonicExtension>,
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