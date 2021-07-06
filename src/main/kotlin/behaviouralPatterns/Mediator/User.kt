package behaviouralPatterns.Mediator

class User(var name: String, private val mediator: ChatRoomMediator) {
    fun sendMessage(message: String){
        mediator.showMessage(this, message)
    }
}