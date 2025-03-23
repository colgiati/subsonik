package dev.olgiati.subsonik.browsing

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetArtistInfo2Test : BaseApiTest() {
    @Test
    fun testGetArtistInfo2() {
        runBlocking {
            val artistId = "2nZ1XptoS8gNj81VNYv5wJ"
            val artistInfo = service!!.getArtistInfo2(artistId, count = 5)
            assertNotNull(artistInfo)
            assertNotNull(artistInfo.biography)
            assertEquals(5, artistInfo.similarArtist?.size)
        }
    }
}