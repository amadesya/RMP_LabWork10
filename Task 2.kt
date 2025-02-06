import kotlinx.coroutines.*

suspend fun loadFiles() = coroutineScope {
    launch {
        try {
            println("Начинаем загрузку файлов")
            for(i in 1..30){
                println("Загружен файл $i")
                delay(3000L)
            }
        }
        catch (e: CancellationException ){
            println("Загрузка отменена")
        }
    }
}

suspend fun main(){
    println("Чтобы отменить введите команду cancel")

    val job = GlobalScope.launch() {
        loadFiles()
    }
    var cancel : String? = null
    while(cancel != "cancel")
    {
        cancel = readln()
        if (cancel.equals("cancel", ignoreCase = true)) {
            job.cancel()
        } else {
            println("Загрузка продолжается...")
        }
        runBlocking { job.join() }
    }
}
