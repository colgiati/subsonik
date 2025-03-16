package dev.olgiati.subsonik.internetRadio

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class GetInternetRadioStationsTest : BaseApiTest() {
    @Test
    fun testGetInternetRadioStations() {
        runBlocking {
            val radioStations = service!!.getInternetRadioStations()
            assertNotNull(radioStations)
            assertTrue(radioStations.isNotEmpty())
        }
    }
}