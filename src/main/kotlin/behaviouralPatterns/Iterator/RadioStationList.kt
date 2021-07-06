package behaviouralPatterns.Iterator

class RadioStationList : Iterator<RadioStation> {
    private val stations = ArrayList<RadioStation>()
    var current: Int = 0

    fun addStation(station: RadioStation) {
        stations.add(station)
    }

    override fun hasNext(): Boolean {
        return current < stations.size
    }

    override fun next(): RadioStation {
        val station = stations[current]
        current++
        return station
    }
}