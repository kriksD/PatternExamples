package structuralPatterns.Decorator

class MilkCoffee(private val coffee: Coffee) : Coffee() {
    override val cost: Int = 2
    override var totalCost: Int = 2
    override lateinit var description: String

    init {
        totalCost += coffee.totalCost
        description = coffee.description + ", " + "milk"
    }
}