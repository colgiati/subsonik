package dev.olgiati.subsonik.model.mediaLibraryScanning.getScanStatus

data class ScanStatus(
    val count: Int,
    val folderCount: Int,
    val lastScan: String,
    val scanning: Boolean
)
