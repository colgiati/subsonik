package dev.olgiati.subsonik.searching

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class Search2Test : BaseApiTest() {
    @Test
    fun testSearch2() {
        runBlocking {
            val results = service!!.search2(
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