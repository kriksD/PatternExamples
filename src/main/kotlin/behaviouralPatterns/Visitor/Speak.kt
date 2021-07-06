package behaviouralPatterns.Visitor

class Speak : AnimalOperation {
    override fun visitMonkey(monkey: Monkey) {
        monkey.shout()
    }

    override fun visitWolf(wolf: Wolf) {
        wolf.howl()
    }
}