package dev.olgiati.subsonik.userManagement

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class GetUserTest : BaseApiTest() {
    @Test
    fun testGetUser() {
        runBlocking {
            val user = service!!.getUser("carlos")
            assertNotNull(user)
            assertEquals("carlos", user.username)
            assertTrue(user.adminRole)
        }
    }
}