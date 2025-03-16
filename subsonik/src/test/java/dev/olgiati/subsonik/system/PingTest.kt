package dev.olgiati.subsonik.system

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test

import kotlin.test.assertEquals

class PingTest : BaseApiTest() {
    @Test
    fun testPing() {
        runBlocking {
            val response = service!!.ping()
            assertEquals(response.status, "ok")
        }
    }
}