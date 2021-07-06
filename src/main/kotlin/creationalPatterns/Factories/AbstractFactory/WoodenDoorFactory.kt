package creationalPatterns.Factories.AbstractFactory

import creationalPatterns.Factories.doors.Carpenter
import creationalPatterns.Factories.doors.Door
import creationalPatterns.Factories.doors.DoorFittingExpert
import creationalPatterns.Factories.doors.WoodenDoor

class WoodenDoorFactory : DoorFactory {
    override fun makeDoor(description: String): Door {
        return WoodenDoor(30, 70, description)
    }

    override fun makeFittingExpert(description: String): DoorFittingExpert {
        return Carpenter(description)
    }
}