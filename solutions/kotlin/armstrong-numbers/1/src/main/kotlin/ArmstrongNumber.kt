object ArmstrongNumber {

    fun check(number: Int): Boolean {
        val digits = number.toString().map { it - '0' }
        val power = digits.size

        val sum = digits.sumOf { digit ->
            Math.pow(digit.toDouble(), power.toDouble()).toInt()
        }

        return sum == number
    }
}
