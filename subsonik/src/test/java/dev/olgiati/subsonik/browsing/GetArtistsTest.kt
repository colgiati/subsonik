package dev.olgiati.subsonik.browsing

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetArtistsTest : BaseApiTest() {
    @Test
    fun testGetArtists() {
        runBlocking {
            val artists = service!!.getArtists()
            assertNotNull(artists)
            assertEquals("#", artists.index?.first()?.name)
        }
    }
}