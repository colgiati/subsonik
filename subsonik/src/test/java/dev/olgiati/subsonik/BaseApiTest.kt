package dev.olgiati.subsonik

import com.google.gson.GsonBuilder
import dev.olgiati.subsonik.service.SubsonikService
import okhttp3.OkHttpClient

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.test.AfterTest
import kotlin.test.BeforeTest

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
open class BaseApiTest {
    protected var service: SubsonikService? = null

    @BeforeTest
    fun prepare() {
        val preferences = getTestPreferences()
        val client = OkHttpClient()

        val builder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
            .addConverterFactory(
                GsonConverterFactory.create(
                    GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create()
                )
            )
            .client(client)


        service = SubsonikService(builder, preferences)
    }

    @AfterTest
    fun destroy() {
        service = null
    }
}