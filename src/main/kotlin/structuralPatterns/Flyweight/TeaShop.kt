package structuralPatterns.Flyweight

class TeaShop(private val teaMaker: TeaMaker) {
    private val orders = arrayListOf<Tea>()

    fun takeOrder(teaType: TeaType) {
        orders.add(teaMaker.make(teaType))
    }

    fun serve() {
        for (order in orders) {
            println("Order for tea ${order.type} completed!")
        }
    }

    fun printWithHashCode () {
        for (order in orders) {
            println(order.hashCode())
        }
    }
}