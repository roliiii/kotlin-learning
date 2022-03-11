interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(private val b: Base) : Base by b {
    override fun print() {
        print("---")
        b.print()
        print("---")
    }
}

fun main() {
    val b = BaseImpl(10)
    val derived: Base = Derived(b)
    derived.print()
}