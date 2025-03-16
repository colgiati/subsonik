package dev.olgiati.subsonik.browsing

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetSimilarSongs2Test : BaseApiTest() {
    @Test
    fun testGetSimilarSongs2Test() {
        runBlocking {
            val artistId = "2nZ1XptoS8gNj81VNYv5wJ"
            val topSongs = service!!.getSimilarSongs2(artistId, count = 5)
            assertNotNull(topSongs)
            assertEquals(5, topSongs.size)
            assertNotNull(topSongs.first().id)
        }
    }
}