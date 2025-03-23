package dev.olgiati.subsonik.service

import java.security.MessageDigest
import kotlin.random.Random

data class SubsonikPreferences(
    val username: String,
    val password: String,
    val client: String,
    val version: String,
    val url: String,
) {
    fun getParams(): Map<String, String> {
        val (salt, token) = getSaltAndToken()
        return mapOf(
            "u" to username,
            "f" to "json",
            "s" to salt,
            "t" to token,
            "c" to client,
            "v" to version,
        )
    }

    private fun getSaltAndToken(): Pair<String, String> {
        val salt = getSalt()
        val token = md5("${password}${salt}")
        return Pair(salt, token)
    }

    @OptIn(ExperimentalStdlibApi::class)
    private fun getSalt() = Random.Default.nextBytes(12).toHexString()

    @OptIn(ExperimentalStdlibApi::class)
    private fun md5(message: String) = MessageDigest.getInstance("MD5")
        .digest(message.toByteArray())
        .toHexString()
}