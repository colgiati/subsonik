package dev.olgiati.subsonik.albumSongsList

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetSongsByGenreTest : BaseApiTest() {
    @Test
    fun testGetSongsByGenre() {
        runBlocking {
            val songs = service!!.getSongsByGenre(genre = "Rock", count = 10)
            assertNotNull(songs)
            assertEquals(10, songs.size)
        }
    }
}