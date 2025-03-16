package dev.olgiati.subsonik.playlists

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetPlaylistsTest : BaseApiTest() {
    @Test
    fun testGetPlaylists() {
        runBlocking {
            val playlists = service!!.getPlaylists()
            assertNotNull(playlists)
            assertEquals(3, playlists.size)
        }
    }
}