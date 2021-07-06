package structuralPatterns.Proxy

class Security(val door: LabDoor) {
    private val password: String = "tupoParoL123123"

    fun open(password: String){
        if (this.password == password){
            door.open()
        } else {
            println("This password is incorrect")
        }
    }

    fun close(){
        door.close()
    }
}