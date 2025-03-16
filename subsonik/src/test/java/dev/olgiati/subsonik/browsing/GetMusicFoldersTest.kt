package dev.olgiati.subsonik.browsing

import dev.olgiati.subsonik.BaseApiTest
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class GetMusicFoldersTest : BaseApiTest() {
    @Test
    fun testGetMusicFolders() {
        runBlocking {
            val folders = service!!.getMusicFolders()
            assertNotNull(folders)
            for (folder in folders) {
                assertTrue(folder.id > 0)
            }
        }
    }
}