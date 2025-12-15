import java.math.BigInteger


object Board {

    fun getGrainCountForSquare(number: Int): BigInteger {
        if (number !in 1..64) {
            throw IllegalArgumentException()
        }

        return BigInteger.TWO.pow(number - 1)
    }

    fun getTotalGrainCount(): BigInteger {
        return BigInteger.TWO.pow(64).subtract(BigInteger.ONE)
    }
}

