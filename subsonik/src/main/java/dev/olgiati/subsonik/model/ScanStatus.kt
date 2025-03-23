package dev.olgiati.subsonik.model

import java.util.Date

/**
 * Fields "folderCount" and "lastScan" are for Navidrome servers only
 */
data class ScanStatus(
    val scanning: Boolean,
    val count: Int?,
    val folderCount: Int?,
    val lastScan: Date?,
)