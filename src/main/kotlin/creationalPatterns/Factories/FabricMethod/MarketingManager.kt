package creationalPatterns.Factories.FabricMethod

import creationalPatterns.Factories.FabricMethod.interviewers.CommunityExecutive
import creationalPatterns.Factories.FabricMethod.interviewers.Interviewer

class MarketingManager : HiringManager {
    override fun makeInterviewer(): Interviewer {
        return CommunityExecutive()
    }
}