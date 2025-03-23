package dev.olgiati.subsonik.albumSongsList

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertNull

class GetNowPlayingTest : BaseApiTest() {
    @Test
    fun testGetStarred2() {
        runBlocking {
            val nowPlaying = service!!.getNowPlaying()
            assertNull(nowPlaying)
        }
    }
}