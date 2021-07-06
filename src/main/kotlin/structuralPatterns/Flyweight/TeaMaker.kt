package structuralPatterns.Flyweight

class TeaMaker {
    private var availableTea = mutableMapOf<TeaType, Tea>()

    fun make(teaType: TeaType) : Tea {
        val tea = availableTea[teaType]

        return if (tea == null) {
            val newTea = Tea(teaType)
            availableTea[teaType] = newTea
            newTea
        } else {
            tea
        }
    }
}