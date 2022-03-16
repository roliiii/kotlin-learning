interface Base {
    fun print()
}

class BaseImpl(private val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(private val b: Base) : Base by b {
    override fun print() {
        print("---")
        b.print()
        print("---")
    }
}

val stringPlus: (String, String) -> String = String::plus

fun main() {
    val b = BaseImpl(10)
    val derived: Base = Derived(b)
    derived.print()
}