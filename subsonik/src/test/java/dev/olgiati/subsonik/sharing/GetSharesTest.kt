package dev.olgiati.subsonik.sharing

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class GetSharesTest : BaseApiTest() {
    @Test
    fun testGetShares() {
        runBlocking {
            val shares = service!!.getShares()
            assertNotNull(shares)
            assertTrue(shares.isNotEmpty())
        }
    }
}