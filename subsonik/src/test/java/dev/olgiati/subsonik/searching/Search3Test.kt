package dev.olgiati.subsonik.searching

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class Search3Test : BaseApiTest() {
    @Test
    fun testSearch3() {
        runBlocking {
            val results = service!!.search3(
                "good ass intro",
                songCount = 1,
                artistCount = 0,
                albumCount = 0
            )
            assertNotNull(results)
            assertNull(results.album)
            assertNull(results.artist)
            assertNotNull(results.song)
            assertEquals(1, results.song.size)
            assertEquals("Chance the Rapper", results.song.first().artist)
        }
    }
}