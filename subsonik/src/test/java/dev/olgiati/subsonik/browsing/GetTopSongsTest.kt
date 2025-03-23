package dev.olgiati.subsonik.browsing

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetTopSongsTest : BaseApiTest() {
    @Test
    fun testGetTopSongs() {
        runBlocking {
            val artist = "Lady Gaga"
            val topSongs = service!!.getTopSongs(artist, count = 5)
            assertNotNull(topSongs)
            assertEquals(5, topSongs.size)
            assertNotNull(topSongs.first().id)
        }
    }
}