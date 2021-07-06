package behaviouralPatterns.Strategy

class BubbleSortStrategy : SortStrategy {
    override fun sort(collection: Collection<Int>): Collection<Int> {
        println("Bubble sort")
        return collection
    }
}