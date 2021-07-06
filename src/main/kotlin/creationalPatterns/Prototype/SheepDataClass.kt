package creationalPatterns.Prototype

data class SheepDataClass(var name: String, var type: String = "mountain sheep"){
    override fun toString(): String {
        return "$name is $type"
    }
}