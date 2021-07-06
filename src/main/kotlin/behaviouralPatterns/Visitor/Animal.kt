package behaviouralPatterns.Visitor

interface Animal {
    fun accept(operation: AnimalOperation)
}