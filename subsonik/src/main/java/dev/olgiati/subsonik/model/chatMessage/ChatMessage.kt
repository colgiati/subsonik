package dev.olgiati.subsonik.model.chatMessage

data class ChatMessage(
    val username: String,
    val time: Long,
    val message: String,
)