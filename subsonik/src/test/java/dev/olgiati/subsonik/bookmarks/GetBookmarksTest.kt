package dev.olgiati.subsonik.bookmarks

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class GetBookmarksTest : BaseApiTest() {
    @Test
    fun testGetBookmarks() {
        runBlocking {
            val bookmarks = service!!.getBookmarks()
            assertNotNull(bookmarks)
            assertTrue(bookmarks.isNotEmpty())
        }
    }
}