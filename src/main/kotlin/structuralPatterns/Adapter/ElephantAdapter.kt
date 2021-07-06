package structuralPatterns.Adapter

import structuralPatterns.Adapter.animals.elephants.Elephant
import structuralPatterns.Adapter.animals.lion.Lion

class ElephantAdapter(private val elephant: Elephant) : Lion {
    override fun roar() {
        elephant.hoot()
    }
}