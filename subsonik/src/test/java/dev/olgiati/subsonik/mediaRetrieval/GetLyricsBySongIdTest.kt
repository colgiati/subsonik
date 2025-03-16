package dev.olgiati.subsonik.mediaRetrieval

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetLyricsBySongIdTest : BaseApiTest() {
    @Test
    fun testGetLyricsBySongId() {
        runBlocking {
            val songId = "fc69f89505b6ac6f846964cc6f51f69e"
            val lyrics = service!!.getLyricsBySongId(songId)
            assertNotNull(lyrics)
            assertNotNull(lyrics.structuredLyrics)
            assertEquals("LoveDrug", lyrics.structuredLyrics.first().displayTitle)
        }
    }
}