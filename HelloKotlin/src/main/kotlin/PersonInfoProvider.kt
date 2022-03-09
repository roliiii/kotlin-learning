import java.util.*

interface PersonInfoProvider {
    val providerInfo: String

    fun printInfo(person: Person)

    fun printInfo2(person: Person) {
        println(providerInfo)
        person.print()
    }
}

interface SessionInfoProvider {
    fun getSessionId() :String
}

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    protected open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        person.print()
    }

    override fun getSessionId(): String {
        return sessionIdPrefix + UUID.randomUUID().toString()
    }

}

fun main() {

    val provider = FancyInfoProvider()

    val person = Person(name = "Alma")

    provider.printInfo(person)
    provider.printInfo2(person)
    println(provider.getSessionId())

    checkTypes(provider)

    val provider2 = object: PersonInfoProvider {
        override val providerInfo: String
            get() = "Noname Provider"

        override fun printInfo(person: Person) {
            println("asdasd")
        }
    }


}

fun checkTypes(infoProvider: PersonInfoProvider){
    if (infoProvider !is SessionInfoProvider) {
        println("not SessionInfoProvider")
    } else {
        println("SessionInfoProvider")
        //(infoProvider as SessionInfoProvider).getSessionId();
        //Smart casting because we chaked that
        infoProvider.getSessionId();
    }
}