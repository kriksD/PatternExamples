package structuralPatterns.Facade

class ComputerFacade(private val computer: Computer) {
    fun turnOn() {
        computer.getElectricShock()
        computer.makeSound()
        computer.showLoadingScreen()
        computer.bam()
    }

    fun turnOff() {
        computer.closeEverything()
        computer.pullCurrent()
        computer.sooth()
    }
}