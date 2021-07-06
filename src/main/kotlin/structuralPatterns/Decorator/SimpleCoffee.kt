package structuralPatterns.Decorator

class SimpleCoffee : Coffee() {
    override val cost: Int = 10
    override var totalCost: Int = 10
    override var description: String = "Coffee"
}