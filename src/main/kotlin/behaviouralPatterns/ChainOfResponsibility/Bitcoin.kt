package behaviouralPatterns.ChainOfResponsibility

class Bitcoin(override var balance: Double) : Account(){
    override fun pay(amountToPay: Double) {
        if (amountToPay <= balance){
            balance -= amountToPay
            println("Payed $amountToPay$ from bitcoin")
        } else if (successor != null){
            successor?.pay(amountToPay)
        } else {
            println("Too little balance in bitcoin")
        }
    }
}