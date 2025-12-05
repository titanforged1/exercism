object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        if (start <= 0) {
            throw IllegalArgumentException()
        }

        if (start == 1) return 0

        var n = start.toLong()   
        var steps = 0

        while (n != 1L) {
            n = if (n % 2 == 0L) {
                n / 2
            } else {
                n * 3 + 1
            }
            steps++
        }

        return steps
    }
}
