package behaviouralPatterns.State

class LowerCase : WritingState {
    override fun write(text: String) {
        println(text.lowercase())
    }
}