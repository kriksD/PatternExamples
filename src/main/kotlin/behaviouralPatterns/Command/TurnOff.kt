package behaviouralPatterns.Command

class TurnOff(private val bulb: Bulb) : Command {
    override fun execute() {
        bulb.turnOff()
    }

    override fun undo() {
        bulb.turnOn()
    }

    override fun redo() {
        execute()
    }
}