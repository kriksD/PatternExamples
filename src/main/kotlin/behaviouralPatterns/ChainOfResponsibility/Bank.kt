package behaviouralPatterns.ChainOfResponsibility

class Bank(override var balance: Double) : Account(){
    override fun pay(amountToPay: Double) {
        if (amountToPay <= balance){
            balance -= amountToPay
            println("Payed $amountToPay$ from bank")
        } else if (successor != null){
            successor?.pay(amountToPay)
        } else {
            println("Too little balance in bank")
        }
    }
}