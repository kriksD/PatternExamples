package behaviouralPatterns.Visitor

class Monkey : Animal {
    fun shout() {
        println("oo-a-oo-oo-a-a")
    }

    override fun accept(operation: AnimalOperation) {
        operation.visitMonkey(this)
    }
}
