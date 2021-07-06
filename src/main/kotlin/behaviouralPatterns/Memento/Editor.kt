package behaviouralPatterns.Memento

class Editor {
    var content: String = ""

    fun save(): EditorMemento {
        return EditorMemento(content)
    }

    fun restore(memento: EditorMemento) {
        content = memento.content
    }
}