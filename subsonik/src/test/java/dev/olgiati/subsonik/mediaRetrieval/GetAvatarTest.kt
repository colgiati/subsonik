package dev.olgiati.subsonik.mediaRetrieval

import com.google.gson.JsonIOException
import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertFailsWith

class GetAvatarTest : BaseApiTest() {
    @Test
    fun testGetAvatar() {
        runBlocking {
            val username = "carlos"
            assertFailsWith<JsonIOException> { service!!.getAvatar(username) }
        }
    }
}