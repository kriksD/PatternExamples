package behaviouralPatterns.Observer

interface JobObservable {
    val observers: ArrayList<JobObserver>

    fun add(observer: JobObserver) {
        observers.add(observer)
    }

    fun remove(observer: JobObserver) {
        observers.remove(observer)
    }

    fun sendUpdateEvent(job: JobPost) {
        for (observer in observers){
            observer.onJobPosted(job)
        }
    }
}