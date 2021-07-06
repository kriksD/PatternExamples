package behaviouralPatterns.State

class Default : WritingState {
    override fun write(text: String) {
        println(text)
    }
}