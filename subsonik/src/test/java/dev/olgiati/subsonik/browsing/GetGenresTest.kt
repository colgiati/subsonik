package dev.olgiati.subsonik.browsing
import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class GetGenresTest : BaseApiTest() {
    @Test
    fun testGetGenres() {
        runBlocking {
            val genres = service!!.getGenres()
            assertNotNull(genres)
            assertTrue(genres.isNotEmpty())
        }
    }
}