package behaviouralPatterns.State

class TextEditor(var writingState: WritingState) {
    fun write(text: String) {
        writingState.write(text)
    }
}