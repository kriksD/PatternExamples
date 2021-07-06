package behaviouralPatterns.Visitor

class Jump : AnimalOperation {
    override fun visitMonkey(monkey: Monkey) {
        println("Jump on the tree")
    }

    override fun visitWolf(wolf: Wolf) {
        println("Jump over the abyss")
    }
}