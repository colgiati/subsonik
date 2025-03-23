package dev.olgiati.subsonik.browsing

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertNotNull

class GetAlbumInfo2Test : BaseApiTest() {
    @Test
    fun testGetAlbumInfo2() {
        runBlocking {
            val albumId = "1gbNtJQVRJRibzbF7ZVbYJ"
            val albumInfo = service!!.getAlbumInfo2(albumId)
            assertNotNull(albumInfo)
            assertNotNull(albumInfo.notes)
        }
    }
}