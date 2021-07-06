package creationalPatterns.Builder

class BurgerBuilder(var size: Int) {
    var cheese = false
    var pepperoni = false
    var tomato = false
    var lettuce = false

    fun addCheese() : BurgerBuilder{
        cheese = true
        return this
    }

    fun addPepperoni() : BurgerBuilder{
        pepperoni = true
        return this
    }

    fun addTomato() : BurgerBuilder{
        tomato = true
        return this
    }

    fun addLettuce() : BurgerBuilder{
        lettuce = true
        return this
    }

    fun build() : Burger {
        return Burger(this)
    }
}