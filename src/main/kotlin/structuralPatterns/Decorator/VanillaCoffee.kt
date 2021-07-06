package structuralPatterns.Decorator

class VanillaCoffee(private val coffee: Coffee) : Coffee() {
    override val cost: Int = 3
    override var totalCost: Int = 3
    override lateinit var description: String

    init {
        totalCost += coffee.totalCost
        description = coffee.description + ", " + "vanilla"
    }
}