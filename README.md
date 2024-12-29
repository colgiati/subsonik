# subsonik
Kotlin Android library for the Subsonic API.

## Usage

### Add dependency

```kotlin
  implementation("dev.olgiati.subsonik:subsonik:0.1.0")
```

### Example

```kotlin
fun main() {
    val logging = HttpLoggingInterceptor()
    logging.setLevel(HttpLoggingInterceptor.Level.BASIC)
    val client = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()
    val retrofit = Retrofit.Builder()
        .baseUrl("domain")
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create()))
        .client(client)
        .build()

    val preferences = Preferences("username", "password", "client-name", "subsonic-api-version-number")
    val service = SubsonikService(retrofit, preferences)

    runBlocking {
        val response = service.getPlayQueue()
        println(response)
    }
}
```
