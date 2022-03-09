fun printFilteredString(list: List<String>, predicate: (String) -> Boolean){
    list.filter(predicate).forEach { println(it) }
}


val predicate: (String)->Boolean = {it.startsWith("K")}

fun predicate2 (asd: String):Boolean {return asd.startsWith("K")}

fun predicate3(startWith: String = "k"): (String)->Boolean { return {x -> x.startsWith(startWith)}}

fun main() {
    val list = listOf("Kotlin", "Java");

    //Last param func you can do this s**t...
    //printFilteredString(list) { it.startsWith("K") }
    //printFilteredString(list, predicate)
    //printFilteredString(list, ::predicate2)
    printFilteredString(list, predicate3("K"))
}