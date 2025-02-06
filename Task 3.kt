import kotlinx.coroutines.*

suspend fun main() {
    suspend fun timeout() = coroutineScope {
        withTimeout(10000) {
            try {
                for (i in 1..5) {
                    println("Попытка подключения к БД")
                    delay(3000L)
                }
            }
            catch (e: TimeoutCancellationException) {
                println(("Превышено время ожидания"))
            }
        }
    }
    timeout()
}