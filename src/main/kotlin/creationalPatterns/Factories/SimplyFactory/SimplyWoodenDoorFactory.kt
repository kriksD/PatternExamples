package creationalPatterns.Factories.SimplyFactory

import creationalPatterns.Factories.doors.Door
import creationalPatterns.Factories.doors.WoodenDoor

class SimplyWoodenDoorFactory {
    companion object {
        fun makeDoor(width: Int, height: Int): Door {
            return WoodenDoor(width, height, "")
        }
    }
}