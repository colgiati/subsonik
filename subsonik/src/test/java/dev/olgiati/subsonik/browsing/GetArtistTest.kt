package dev.olgiati.subsonik.browsing

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetArtistTest : BaseApiTest() {
    @Test
    fun testGetArtist() {
        runBlocking {
            val albumId = "1gbNtJQVRJRibzbF7ZVbYJ"
            val artistId = "2nZ1XptoS8gNj81VNYv5wJ"
            val artistName = "Lady Gaga"
            val artist = service!!.getArtist(artistId)
            assertNotNull(artist)
            assertEquals(artistName, artist.name)
            assertEquals(artistId, artist.id)
            assertEquals(albumId, artist.album?.first()?.id)
        }
    }
}