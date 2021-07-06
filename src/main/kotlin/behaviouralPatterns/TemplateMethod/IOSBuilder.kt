package behaviouralPatterns.TemplateMethod

class IOSBuilder : Builder {
    override fun test() {
        println("testing IOS app")
    }

    override fun lint() {
        println("copying IOS app code")
    }

    override fun assemble() {
        println("IOS app build")
    }

    override fun deploy() {
        println("Deploying the assembly to the server")
    }
}