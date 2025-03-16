package dev.olgiati.subsonik.browsing

import dev.olgiati.subsonik.BaseApiTest
import dev.olgiati.subsonik.service.SubsonikException
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull

class GetMusicDirectoryTest : BaseApiTest() {
    /**
     * Directory doesn't exist, @SubsonikException expected.
     */
    @Test
    fun testGetMusicDirectoryFail() {
        runBlocking {
            assertFailsWith<SubsonikException> { service!!.getMusicDirectory("1") }
        }
    }

    @Test
    fun testGetMusicDirectory() {
        runBlocking {
            val albumId = "5P4wkAMmV72fz9WAhJ8evE"
            val directory = service!!.getMusicDirectory(albumId)
            assertNotNull(directory)
            assertEquals(8, directory.child?.first()?.contributors?.size)
            assertEquals(albumId, directory.id)
        }
    }
}