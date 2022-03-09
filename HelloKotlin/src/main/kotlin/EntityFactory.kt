import java.util.*

interface IdProvider {
    fun getId(): String
}

class Entity private constructor(val id: String) {

    companion object Factory :IdProvider {
        const val id = "id"

        override fun getId(): String {
            return "123"
        }

        fun create() = Entity(getId())
    }

}

enum class EntityType {
    EASY, HARD;

    fun getFormatedName() = name.lowercase()
}

object EntityFactory {
    fun create(type : EntityType) : Entity2 {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY -> type.name
            EntityType.HARD -> type.getFormatedName()
        }
        return Entity2(id, name)
    }
}

class Entity2(val id: String, val name:String) {

    override fun toString(): String {
        return "id: $id name: $name"
    }

}

fun main() {
    val mediumEntity = EntityFactory.create(EntityType.HARD)
    print(mediumEntity)
}

