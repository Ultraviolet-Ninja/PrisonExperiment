package prison

fun main() {
    val results = mutableListOf<Double>()

    for (i in 0 until 100) {
        results.add(runTrial())
    }

    val stats = results.stream()
        .mapToDouble { i -> i }
        .summaryStatistics()

    println("Min: ${stats.min}")
    println("Avg: ${stats.average}")
    println("Max: ${stats.max}")
}

private fun runTrial(): Double {
    val results = mutableListOf<Boolean>()
    val numberOfRuns = 1000

    for (i in 0 until numberOfRuns) {
        val yard = createYard(10)
        results.add(runYard(yard, 0.75))
    }

    val percentage = results.stream()
        .filter { i -> i }
        .count()
        .times(100)
        .toDouble()

    return percentage/numberOfRuns
}