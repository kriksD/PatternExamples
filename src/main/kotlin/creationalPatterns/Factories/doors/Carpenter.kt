package creationalPatterns.Factories.doors

class Carpenter(override var description: String) : DoorFittingExpert {
    override fun talkAboutDoor(door: Door) {
        if (door is WoodenDoor) {
            println(door.description + "|" + door.width + "|" + door.height)
        } else {
            println("I to work only with wooden CreationalPatterns.Factories.doors.")
        }
    }
}