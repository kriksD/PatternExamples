package structuralPatterns.Facade

class Computer {
    fun getElectricShock() {
        println("Ouch!")
    }

    fun makeSound() {
        println("bip-bip!")
    }

    fun showLoadingScreen() {
        println("Loading..")
    }

    fun bam() {
        println("ready!")
    }

    fun closeEverything() {
        println("Closing!")
    }

    fun sooth() {
        println("Zzzzz")
    }

    fun pullCurrent() {
        println("Bgg!")
    }
}