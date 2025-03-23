package dev.olgiati.subsonik.mediaRetrieval

import com.google.gson.stream.MalformedJsonException
import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertFailsWith

class GetCoverArtTest : BaseApiTest() {
    @Test
    fun testGetCoverArt() {
        runBlocking {
            val coverArtId = "al-1gbNtJQVRJRibzbF7ZVbYJ_660b03ae"
            assertFailsWith<MalformedJsonException> { service!!.getCoverArt(coverArtId) }
        }
    }
}