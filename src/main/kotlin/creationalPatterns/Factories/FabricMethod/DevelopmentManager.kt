package creationalPatterns.Factories.FabricMethod

import creationalPatterns.Factories.FabricMethod.interviewers.Developer
import creationalPatterns.Factories.FabricMethod.interviewers.Interviewer

class DevelopmentManager : HiringManager {
    override fun makeInterviewer(): Interviewer {
        return Developer()
    }
}