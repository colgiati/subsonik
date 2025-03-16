package dev.olgiati.subsonik.mediaRetrieval

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetLyricsTest : BaseApiTest() {
    @Test
    fun testGetLyrics() {
        runBlocking {
            val artist = "Lady Gaga"
            val title = "LoveDrug"
            val lyrics = service!!.getLyrics(artist, title)
            assertNotNull(lyrics)
            assertEquals(artist, lyrics.artist)
            assertEquals(title, lyrics.title)
            assertNotNull(lyrics.value)
        }
    }
}