package behaviouralPatterns.Visitor

class Wolf : Animal {
    fun howl() {
        println("Wwooooo")
    }

    override fun accept(operation: AnimalOperation) {
        operation.visitWolf(this)
    }
}
