package creationalPatterns.Factories.AbstractFactory

import creationalPatterns.Factories.doors.*

class IronDoorFactory:DoorFactory {
    override fun makeDoor(description: String): Door {
        return IronDoor(30, 70, description)
    }

    override fun makeFittingExpert(description: String): DoorFittingExpert {
        return Welder(description)
    }
}