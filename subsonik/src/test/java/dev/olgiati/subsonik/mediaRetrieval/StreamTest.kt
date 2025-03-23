package dev.olgiati.subsonik.mediaRetrieval

import com.google.gson.JsonIOException
import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertFailsWith

class StreamTest : BaseApiTest() {
    @Test
    fun testStream() {
        runBlocking {
            val songId = "fc69f89505b6ac6f846964cc6f51f69e"
            assertFailsWith<JsonIOException> { service!!.stream(songId) }
        }
    }

    @Test
    fun testGetStreamURL() {
        runBlocking {
            val songId = "fc69f89505b6ac6f846964cc6f51f69e"
            println(service!!.streamURL(songId))
        }
    }
}