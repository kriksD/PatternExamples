package structuralPatterns.Composite

class Employee(override var isFree: Boolean, override var name: String) : Assignee() {
    override fun takeTask() {
        if (isFree) {
            println("$name: start")
            isFree = false
        } else {
            println("$name: i work")
        }
    }
}