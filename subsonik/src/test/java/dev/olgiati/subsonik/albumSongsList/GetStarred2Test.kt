package dev.olgiati.subsonik.albumSongsList

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class GetStarred2Test : BaseApiTest() {
    @Test
    fun testGetStarred2() {
        runBlocking {
            val starred = service!!.getStarred2()
            assertNotNull(starred)
            assertNotNull(starred.album)
            assertNull(starred.artist)
            assertNotNull(starred.song)
        }
    }
}