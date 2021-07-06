package structuralPatterns.Proxy

import creationalPatterns.Factories.doors.Door

class LabDoor : Door {
    override var height: Int = 50
    override var width: Int = 30
    override var description: String = "SuperLabDoorUltra2000GamingPro"

    override fun open() {
        println("Door $description is opened")
    }

    override fun close() {
        println("Door $description is closed")
    }
}