package dev.olgiati.subsonik.playlists

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetPlaylistTest : BaseApiTest() {
    @Test
    fun testGetPlaylist() {
        val playlistId = "e0d7e722-50f0-4a78-92f5-cbebbcff9035"
        runBlocking {
            val playlist = service!!.getPlaylist(playlistId)
            assertEquals(playlistId, playlist.id)
            assertNotNull(playlist.entry)
            assertEquals(playlist.songCount, playlist.entry.size)
        }
    }
}