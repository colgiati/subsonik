package dev.olgiati.subsonik.system

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class GetLicenseTest : BaseApiTest() {
    @Test
    fun testGetLicense() {
        runBlocking {
            val license = service!!.getLicense()
            assertNotNull(license)
            assertTrue(license.valid)
        }
    }
}