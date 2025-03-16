package dev.olgiati.subsonik.mediaScanningLibrary

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertNotNull

class GetScanStatusTest : BaseApiTest() {
    @Test
    fun testScanStatus() {
        runBlocking {
            val scanStatus = service!!.getScanStatus()
            assertNotNull(scanStatus)
            assertFalse(scanStatus.scanning)
            assertNotNull(scanStatus.lastScan)
        }
    }
}