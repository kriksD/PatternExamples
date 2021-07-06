package behaviouralPatterns.Observer

class JobSeeker(val name: String) : JobObserver {
    override fun onJobPosted(job: JobPost) {
        println("$name! We have new job for you: ${job.title}")
    }
}