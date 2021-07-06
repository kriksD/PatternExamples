package behaviouralPatterns.Visitor

interface AnimalOperation {
    fun visitMonkey(monkey: Monkey)
    fun visitWolf(wolf: Wolf)
}