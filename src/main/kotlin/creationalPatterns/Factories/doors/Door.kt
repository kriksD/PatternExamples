package creationalPatterns.Factories.doors

interface Door {
    var height: Int
    var width: Int
    var description: String

    fun open() { println("Door is opened") }
    fun close() { println("Door is closed") }
}