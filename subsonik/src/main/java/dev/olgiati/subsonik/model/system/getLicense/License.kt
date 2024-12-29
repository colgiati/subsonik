package dev.olgiati.subsonik.model.system.getLicense

import java.util.*

data class License(
    val valid: Boolean,
    val email: String,
    val licenseExpires: Date,
)
