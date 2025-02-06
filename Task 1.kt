import kotlinx.coroutines.*

//suspend fun main() = coroutineScope{
//    launch {
//        for(i in 0..500){
//            println("$i: овечка")
//        }
//        delay(1000)
//        for (i in 501..1000) {
//            println("$i: овечка")
//        }
//    }
//    launch {
//        for(i in 0..500){
//            println("$i: котик")
//            delay(10)
//        }
//    }
//    println()
//}

suspend fun main(){
    suspend fun printSheeps() = coroutineScope{
        launch {
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
            for(i in 0..500){
                println("$i: котик")
                delay(10)
            }
        }
        println()
    }
    printSheeps()
    printCats()
}