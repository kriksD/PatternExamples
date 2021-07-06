package behaviouralPatterns.Command

class RemoteControl {
    fun submit(command: Command) {
        command.execute()
    }
}