package structuralPatterns.Decorator

abstract class Coffee {
    open val cost: Int = 10
    open var totalCost: Int = 10
    open var description: String = "Coffee"

    override fun toString(): String {
        return "$description for $totalCost$"
    }
}