package dev.olgiati.subsonik.system

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Ignore
import kotlin.test.Test
import kotlin.test.assertEquals

class TokenInfoTest : BaseApiTest() {
    @Test
    @Ignore("Navidrome servers do not support this endpoint currently.")
    fun testTokenInfo() {
        runBlocking {
            val tokenInfo = service!!.tokenInfo("test")
            assertEquals(tokenInfo.username, "")
        }
    }
}