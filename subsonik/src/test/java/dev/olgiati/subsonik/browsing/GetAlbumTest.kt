package dev.olgiati.subsonik.browsing

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetAlbumTest : BaseApiTest() {
    @Test
    fun testGetAlbum() {
        runBlocking {
            val albumId = "1gbNtJQVRJRibzbF7ZVbYJ"
            val artistId = "2nZ1XptoS8gNj81VNYv5wJ"
            val album = service!!.getAlbum(albumId)
            assertNotNull(album)
            assertEquals(albumId, album.id)
            assertEquals(artistId, album.artistId)
        }
    }
}