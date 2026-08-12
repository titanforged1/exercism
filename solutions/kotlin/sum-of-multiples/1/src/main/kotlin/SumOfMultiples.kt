object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        val numbers = mutableSetOf<Int>()

        for (factor in factors) {
            if (factor <= 0) continue  

            var multiple = factor
            while (multiple < limit) {
                numbers.add(multiple)
                multiple += factor
            }
        }

        return numbers.sum()
    }
}

