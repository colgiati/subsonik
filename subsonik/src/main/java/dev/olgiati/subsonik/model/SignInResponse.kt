package dev.olgiati.subsonik.model

data class SignInResponse(
    val id: String,
    val isAdmin: String,
    val lastFMApiKey: String,
    val name: String,
    val subsonicSalt: String,
    val subsonicToken: String,
    val token: String,
    val username: String,
)
