package dev.olgiati.subsonik.mediaRetrieval

import com.google.gson.JsonIOException
import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertFailsWith

class DownloadTest : BaseApiTest() {
    @Test
    fun testDownload() {
        runBlocking {
            val songId = "fc69f89505b6ac6f846964cc6f51f69e"
            assertFailsWith<JsonIOException> { service!!.download(songId) }
        }
    }
}