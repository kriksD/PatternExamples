package structuralPatterns.Composite

abstract class Assignee {
    protected open var isFree: Boolean = true
    open var name: String = "unknown"

    open fun canHandleTask(): Boolean { return isFree }
    open fun takeTask() { println("i can`t perform task") }
}