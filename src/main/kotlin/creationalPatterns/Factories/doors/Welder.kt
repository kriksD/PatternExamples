package creationalPatterns.Factories.doors

class Welder(override var description: String) : DoorFittingExpert {
    override fun talkAboutDoor(door: Door) {
        if (door is IronDoor){
            println(door.description + "|" + door.width + "|" + door.height)
        } else {
            println("I to work only with iron CreationalPatterns.Factories.doors.")
        }
    }
}