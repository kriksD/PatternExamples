package behaviouralPatterns.Strategy

class Sorter(private val sortStrategy: SortStrategy) {
    fun sort(collection: Collection<Int>) : Collection<Int>{
        return sortStrategy.sort(collection)
    }
}