package creationalPatterns.Factories.AbstractFactory

import creationalPatterns.Factories.doors.Door
import creationalPatterns.Factories.doors.DoorFittingExpert

interface DoorFactory {
    fun makeDoor(description: String): Door
    fun makeFittingExpert(description: String): DoorFittingExpert
}