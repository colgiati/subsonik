package dev.olgiati.subsonik.userManagement

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class GetUsersTest : BaseApiTest() {
    @Test
    fun testGetUser() {
        runBlocking {
            val users = service!!.getUsers()
            assertNotNull(users)
            assertTrue(users.isNotEmpty())
        }
    }
}