package dev.olgiati.subsonik.mediaScanningLibrary

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertNotNull

class StartScanTest : BaseApiTest() {
    @Test
    fun testScanStatus() {
        runBlocking {
            val scanStatus = service!!.startScan()
            assertNotNull(scanStatus)
            assertNotNull(scanStatus.lastScan)
        }
    }
}