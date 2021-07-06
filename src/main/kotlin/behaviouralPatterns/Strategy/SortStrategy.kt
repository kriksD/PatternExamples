package behaviouralPatterns.Strategy

interface SortStrategy {
    fun sort(collection: Collection<Int>) : Collection<Int>
}