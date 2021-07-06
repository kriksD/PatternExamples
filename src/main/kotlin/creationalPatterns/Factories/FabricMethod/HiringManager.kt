package creationalPatterns.Factories.FabricMethod

import creationalPatterns.Factories.FabricMethod.interviewers.Interviewer

interface HiringManager {

    fun makeInterviewer() : Interviewer

    fun takeInterview(){
        val interviewer = makeInterviewer()
        interviewer.askQuestions()
    }
}