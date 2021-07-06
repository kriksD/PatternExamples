package behaviouralPatterns.Command

class TurnOn(private val bulb: Bulb) : Command {
    override fun execute() {
        bulb.turnOn()
    }

    override fun undo() {
        bulb.turnOff()
    }

    override fun redo() {
        execute()
    }
}