package behaviouralPatterns.Observer

interface JobObserver {
    fun onJobPosted(job: JobPost)
}