package dev.olgiati.subsonik.browsing

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class GetIndexesTest : BaseApiTest() {
    @Test
    fun testGetIndexes() {
        runBlocking {
            val indexes = service!!.getIndexes()
            assertNotNull(indexes)
            for (index in indexes) {
                assertTrue(index.artist?.isNotEmpty() == true)
            }
        }
    }
}