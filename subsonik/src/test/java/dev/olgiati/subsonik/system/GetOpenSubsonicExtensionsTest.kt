package dev.olgiati.subsonik.system

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertTrue

class GetOpenSubsonicExtensionsTest : BaseApiTest() {
    @Test
    fun testGetOpenSubsonicExtensions() {
        runBlocking {
            val extensions = service!!.getOpenSubsonicExtensions()
            for (extension in extensions) {
                assertTrue(1 in extension.versions)
            }
        }
    }
}