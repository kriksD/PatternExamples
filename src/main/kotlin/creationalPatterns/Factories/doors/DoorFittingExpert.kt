package creationalPatterns.Factories.doors

interface DoorFittingExpert {
    var description: String
    fun talkAboutDoor(door: Door)
}