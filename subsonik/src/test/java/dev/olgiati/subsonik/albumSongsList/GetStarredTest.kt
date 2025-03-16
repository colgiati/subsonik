package dev.olgiati.subsonik.albumSongsList

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class GetStarredTest : BaseApiTest() {
    @Test
    fun testGetStarred() {
        runBlocking {
            val starred = service!!.getStarred()
            assertNotNull(starred)
            assertNotNull(starred.album)
            assertNull(starred.artist)
            assertNotNull(starred.song)
        }
    }
}