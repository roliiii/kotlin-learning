//primary constructor
//public by default
//internal -> public in module
//protected -> in class or subclass
//private
class Person (val name: String) {

    var nickName: String? = null
        //field represents the property not the nickName in that case
        get() {
            println("nickName value $field")
            return field
        }
        set(value) {
            field = value
        }

    init {
        println("Person init block 1")
    }
    //secondary constructor
    constructor(): this("asd")

    init {
        println("Person init block 2")
    }

    fun print(){
        //null check Elvis operator
        val nickNameToPrint = nickName ?: "No nickname"
        println("$name, $nickNameToPrint")
    }

}
