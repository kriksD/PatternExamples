package creationalPatterns.Singltone

class PresidentNormalClass private constructor() {
    companion object{
        private var instance: PresidentNormalClass? = null

        fun getInstance(): PresidentNormalClass {

            if (instance == null) {
                instance = PresidentNormalClass()
            }

            return instance as PresidentNormalClass
        }
    }

    var age: Int = 30

    fun sayShit(){
        println("bla bla bla")
    }
}