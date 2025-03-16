package dev.olgiati.subsonik.browsing

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetSongTest : BaseApiTest() {
    @Test
    fun testGetSong() {
        runBlocking {
            val albumId = "5P4wkAMmV72fz9WAhJ8evE"
            val songId = "fc69f89505b6ac6f846964cc6f51f69e"
            val response = service!!.getSong(songId)
            assertNotNull(response)
            assertEquals(songId, response.id)
            assertEquals(albumId, response.parent)
        }
    }
}