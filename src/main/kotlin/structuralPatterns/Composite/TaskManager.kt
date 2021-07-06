package structuralPatterns.Composite

class TaskManager {
    fun sendTaskFor(assignees: List<Assignee>) {
        for (assignee in assignees) {
            if (assignee.canHandleTask()){
                assignee.takeTask()
                return
            }
        }
        println("There are no is free assignees")
    }
}