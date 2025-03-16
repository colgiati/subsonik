package dev.olgiati.subsonik.model.response.system

import dev.olgiati.subsonik.model._base.SubsonicResponse
import dev.olgiati.subsonik.model.TokenInfo
import dev.olgiati.subsonik.model._base.SubsonicError

class TokenInfoResponse(
    val tokenInfo: TokenInfo,
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
