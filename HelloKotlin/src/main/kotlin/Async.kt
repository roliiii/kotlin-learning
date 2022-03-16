import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.selects.select


fun main(){

    runBlocking {
        doWorld()
    }

    runBlocking {
        val result: Deferred<String> = async { doReturnSomething() }
        println("asd before")
        println(result.await())
    }

    runBlocking {
        val channel = Channel<String>()
        launch {
            channel.send("Dagi")
        }

        select<Unit> {
            channel.onReceive { x -> println(x) }
        }

        /*launch {
            val resp = channel.receive();
            println(resp)
        }*/
    }

    println("done")
}



private suspend fun doWorld() {
    coroutineScope {
        val job = launch {
            delay(1000L)
            println("World1!")
        }
        launch {
            delay(2000L)
            println("World2!")
        }
        job.join()
        println("Hello")
    }
}

private suspend fun doReturnSomething(): String{
    delay(1000)
    return "asd after"
}