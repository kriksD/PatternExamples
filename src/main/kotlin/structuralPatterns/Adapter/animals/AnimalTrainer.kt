package structuralPatterns.Adapter.animals

import structuralPatterns.Adapter.animals.lion.Lion

class AnimalTrainer {
    fun train(lion: Lion){
        lion.roar()
    }
}