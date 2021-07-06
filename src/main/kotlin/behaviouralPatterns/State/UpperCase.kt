package behaviouralPatterns.State

class UpperCase : WritingState {
    override fun write(text: String) {
        println(text.uppercase())
    }
}