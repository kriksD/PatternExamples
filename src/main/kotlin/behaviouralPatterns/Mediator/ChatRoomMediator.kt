package behaviouralPatterns.Mediator

interface ChatRoomMediator {
    fun showMessage(user: User, message: String)
}