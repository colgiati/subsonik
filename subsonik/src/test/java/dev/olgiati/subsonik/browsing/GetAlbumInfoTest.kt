package dev.olgiati.subsonik.browsing

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertNotNull

class GetAlbumInfoTest : BaseApiTest() {
    @Test
    fun testGetAlbumInfo() {
        runBlocking {
            val albumId = "1gbNtJQVRJRibzbF7ZVbYJ"
            val albumInfo = service!!.getAlbumInfo(albumId)
            assertNotNull(albumInfo)
            assertNotNull(albumInfo.notes)
        }
    }
}