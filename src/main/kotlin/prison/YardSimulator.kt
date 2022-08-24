package prison

fun runYard(yard: List<Int>, percentageOfBoxesToOpen: Double): Boolean {
    val prisoners = (yard.indices)
    var prisonersWithFoundNumbers = 0
    val maxBoxCount = (yard.size * percentageOfBoxesToOpen).toInt()

    for (prisoner in prisoners) {
        var currentBox = prisoner
        var boxCount = 0

        do {
            val number = yard[currentBox]
            if (number == prisoner) {
                prisonersWithFoundNumbers++
                break
            }

            currentBox = number
        } while (++boxCount < maxBoxCount)

        if (boxCount == maxBoxCount)
            return false
    }
    return prisonersWithFoundNumbers == yard.size
}