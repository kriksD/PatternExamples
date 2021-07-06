package behaviouralPatterns.Mediator

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class ChatRoom : ChatRoomMediator {
    override fun showMessage(user: User, message: String) {
        val date = LocalDateTime.now()
        date.format(DateTimeFormatter.ofPattern("dd.mm.yyyy hh:mm:ss"))
        val userName = user.name
        println("($date) $userName> $message")
    }
}