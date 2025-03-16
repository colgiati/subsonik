package dev.olgiati.subsonik.model

import java.util.Date

data class License(
    val valid: Boolean,
    val email: String?,
    val licenseExpires: Date?,
    val trialExpires: Date?
)