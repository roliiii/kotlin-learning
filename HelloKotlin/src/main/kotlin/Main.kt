//val = const
//var

//top level variable
val toplevelConst: String = "asd";
var nullableVariable: String? = null;


fun simpleFunc(asd: String): String {
    return "asd"
}

fun funcWithDefaultOneLiner(asd: String = "defaultVal") = println(asd.uppercase())

fun funcWithVararg(vararg asd:String) {
    asd.forEach { s -> println(s) }
}


fun main(args: Array<String>) {
    var name = "asd";

    when(name) {
        null -> println("Hi")
        //default
        else -> println(name)
    }

    val greeting = if(name != null) name else "hi"

    val whengreeting = when(name) {
        null -> println("Hi")
        //default
        else -> println(name)
    }

    println(funcWithDefaultOneLiner(name))

    println("$name $name")

    val instrestingArray = listOf<String>("Kotlin")

    for(asd in instrestingArray) {
        println(asd)
    }

    instrestingArray.forEachIndexed { index, s -> println("$s $index") }

    //mutableMapOf
    val map = mapOf(1 to "a", 2 to "b")

    map.forEach { t, u -> println("$t $u") }

    funcWithVararg("asd","asd3","asd2")

    funcWithDefaultOneLiner()

    funcWithDefaultOneLiner(asd="asf")

    val asd: Person = Person("asd")
    asd.print()

}


