package dev.olgiati.subsonik.albumSongsList

import dev.olgiati.subsonik.BaseApiTest
import dev.olgiati.subsonik.model.response.albumSongLists.ListType
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetAlbumListTest : BaseApiTest() {
    @Test
    fun testGetAlbumListByYear() {
        runBlocking {
            val albums =
                service!!.getAlbumList(ListType.BY_YEAR, size = 10, fromYear = 2024, toYear = 2025)
            assertNotNull(albums)
            assertEquals(10, albums.size)
        }
    }

    @Test
    fun testGetAlbumListByGenre() {
        runBlocking {
            val albums = service!!.getAlbumList(ListType.BY_GENRE, size = 5, genre = "Pop")
            assertNotNull(albums)
            assertEquals(5, albums.size)
        }
    }
}