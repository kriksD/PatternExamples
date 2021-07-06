package behaviouralPatterns.TemplateMethod

interface Builder {
    fun build() {
        test()
        lint()
        assemble()
        deploy()
    }

    fun test()
    fun lint()
    fun assemble()
    fun deploy()
}