import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

suspend fun main() = coroutineScope{
    val message: Deferred<Int> = async { connectToWebServer() }
    println("message: ${message.await()}")
}

suspend fun connectToWebServer(): Int {
    println("Подключение к серверу")
    delay(1000)

    val HTTP = arrayOf(200, 400, 401, 403, 404, 410, 500)
    return HTTP.random()
}

