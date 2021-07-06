package creationalPatterns.Prototype

class SheepNormalClass(var name: String, var type: String = "mountain sheep"){
    override fun toString(): String {
        return "$name is $type"
    }

    fun clone():SheepNormalClass{
        return SheepNormalClass(name, type)
    }
}