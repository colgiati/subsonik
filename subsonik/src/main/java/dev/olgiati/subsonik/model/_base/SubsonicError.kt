package dev.olgiati.subsonik.model._base

data class SubsonicError(
    val code: Int,
    val message: String?,
    val helpUrl: String?,
)