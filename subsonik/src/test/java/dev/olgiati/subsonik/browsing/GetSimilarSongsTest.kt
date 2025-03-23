package dev.olgiati.subsonik.browsing

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetSimilarSongsTest : BaseApiTest() {
    @Test
    fun testGetSimilarSongsTest() {
        runBlocking {
            val albumId = "1gbNtJQVRJRibzbF7ZVbYJ"
            val topSongs = service!!.getSimilarSongs(albumId, count = 5)
            assertNotNull(topSongs)
            assertEquals(5, topSongs.size)
            assertNotNull(topSongs.first().id)
        }
    }
}