package behaviouralPatterns.Observer

class JobPostings : JobObservable {
    override val observers = ArrayList<JobObserver>()

    fun postJob(job: JobPost) {
        sendUpdateEvent(job)
    }
}