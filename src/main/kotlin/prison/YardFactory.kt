package prison

fun createYard(sideLength: Int): List<Int> {
    return (0 until (sideLength * sideLength)).shuffled()
}