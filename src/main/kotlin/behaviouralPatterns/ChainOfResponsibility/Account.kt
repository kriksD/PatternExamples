package behaviouralPatterns.ChainOfResponsibility

abstract class Account {
    var successor: Account? = null
    protected open var balance: Double = 0.0

    abstract fun pay(amountToPay: Double)
}