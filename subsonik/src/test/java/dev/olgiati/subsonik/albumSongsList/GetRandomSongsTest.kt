package dev.olgiati.subsonik.albumSongsList

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetRandomSongsTest : BaseApiTest() {
    @Test
    fun testGetRandomSongs() {
        runBlocking {
            val songs = service!!.getRandomSongs(size = 10, fromYear = 2024, toYear = 2025)
            assertNotNull(songs)
            assertEquals(10, songs.size)
        }
    }
}