package creationalPatterns.Singltone

class PresidentNormalClass2 {

    companion object {
        private val instance = PresidentNormalClass2()

        fun getInstance(): PresidentNormalClass2 {
            return instance
        }
    }

    var age: Int = 30

    fun sayShit() {
        println("bla bla bla")
    }
}