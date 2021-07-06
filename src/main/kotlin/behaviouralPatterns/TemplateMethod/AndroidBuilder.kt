package behaviouralPatterns.TemplateMethod

class AndroidBuilder : Builder {
    override fun test() {
        println("testing android app")
    }

    override fun lint() {
        println("copying android app code")
    }

    override fun assemble() {
        println("android app build")
    }

    override fun deploy() {
        println("Deploying the assembly to the server")
    }
}