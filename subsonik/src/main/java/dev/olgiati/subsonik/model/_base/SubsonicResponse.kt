package dev.olgiati.subsonik.model._base

open class SubsonicResponse(
    val status: String,
    val version: String,
    val type: String,
    val serverVersion: String,
    val openSubsonic: Boolean,
    val error: SubsonicError?
)
