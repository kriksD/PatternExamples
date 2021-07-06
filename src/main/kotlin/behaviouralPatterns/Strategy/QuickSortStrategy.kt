package behaviouralPatterns.Strategy

class QuickSortStrategy : SortStrategy {
    override fun sort(collection: Collection<Int>): Collection<Int> {
        println("Quick sort")
        return collection
    }
}