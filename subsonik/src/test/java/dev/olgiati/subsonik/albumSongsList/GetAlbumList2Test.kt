package dev.olgiati.subsonik.albumSongsList

import dev.olgiati.subsonik.BaseApiTest
import dev.olgiati.subsonik.model.response.albumSongLists.ListType
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetAlbumList2Test : BaseApiTest() {
    @Test
    fun testGetAlbumList2ByYear() {
        runBlocking {
            val albums =
                service!!.getAlbumList2(ListType.BY_YEAR, size = 10, fromYear = 2024, toYear = 2025)
            assertNotNull(albums)
            assertEquals(10, albums.size)
        }
    }

    @Test
    fun testGetAlbumList2ByGenre() {
        runBlocking {
            val albums = service!!.getAlbumList2(ListType.BY_GENRE, size = 5, genre = "Pop")
            assertNotNull(albums)
            assertEquals(5, albums.size)
        }
    }
}