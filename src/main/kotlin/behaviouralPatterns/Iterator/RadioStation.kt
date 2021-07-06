package behaviouralPatterns.Iterator

class RadioStation(val frequency: Float) : Comparable<RadioStation> {
    override fun compareTo(other: RadioStation): Int {
        return frequency.compareTo(other.frequency)
    }
}