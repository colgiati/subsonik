package dev.olgiati.subsonik.bookmarks

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class GetPlayQueueTest : BaseApiTest() {
    @Test
    fun testGetBookmarks() {
        runBlocking {
            val queue = service!!.getPlayQueue()
            assertNotNull(queue)
            assertEquals("carlos", queue.username)
        }
    }
}