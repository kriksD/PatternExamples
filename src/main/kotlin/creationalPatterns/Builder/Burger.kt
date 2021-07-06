package creationalPatterns.Builder

data class Burger(val builder: BurgerBuilder) {

    private var size = 10
    private var cheese = false
    private var pepperoni = false
    private var tomato = false
    private var lettuce = false

    init {
        this.size = builder.size
        this.cheese = builder.cheese
        this.pepperoni = builder.pepperoni
        this.tomato = builder.tomato
        this.lettuce = builder.lettuce
    }

    override fun toString(): String {
        return "Size: $size | Cheese: $cheese | Pepperoni: $pepperoni | Tomato: $tomato | Lettuce: $lettuce"
    }
}

