package structuralPatterns.Composite

class Team(override var name: String, private val assignees: ArrayList<Assignee>) : Assignee() {
    fun add(assignee: Assignee) { assignees.add(assignee) }
    fun addAllOf(assignees: List<Assignee>) { this.assignees.addAll(assignees) }
    fun remove(assignee: Assignee) { assignees.remove(assignee) }

    override fun canHandleTask(): Boolean {
        for (assignee in assignees) {
            if (assignee.canHandleTask()) { return true }
        }
        return false
    }

    override fun takeTask() {
        for (assignee in assignees){
            if (assignee.canHandleTask()){
                assignee.takeTask()
                return
            }
        }
    }
}