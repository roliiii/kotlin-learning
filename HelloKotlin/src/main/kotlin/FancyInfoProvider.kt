class FancyInfoProvider : BasicInfoProvider() {

    override val sessionIdPrefix: String
        get() = "Fancy "

    override val providerInfo: String
        get() = "FancyProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("FancyInfoo")
    }
}