import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() = coroutineScope{

    suspend fun printSheeps() = coroutineScope{
        launch {
            println("Корутина выполняется на потоке: ${Thread.currentThread().name}")
            for(i in 0..500){
                println("$i: овечка")
            }
            delay(1000)
            for (i in 501..1000) {
                println("$i: овечка")
            }
        }
    }
    suspend fun printCats() = coroutineScope {
        launch {
            println("Корутина выполняется на потоке: ${Thread.currentThread().name}")
            for(i in 0..500){
                println("$i: котик")
                delay(10)
            }
        }
        println()
    }
    printSheeps()
    printCats()

    println("Функция main выполняется на потоке: ${Thread.currentThread().name}")

}
