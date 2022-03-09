fun main() {
    val list = listOf("Kotlin", "Java", "JavaScript", null);

    list
        .filterNotNull()
        .take(2)
        .associate { it to it.length }
        //.filter {it.startsWith("J")}
        //.map {it.length}
        .forEach {
        println("${it.key}: ${it.value}")
    }
}