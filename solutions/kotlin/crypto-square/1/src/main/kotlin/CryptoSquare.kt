import kotlin.math.sqrt

object CryptoSquare {
    fun ciphertext(plaintext: String): String {

        var text = plaintext.lowercase().filter { it.isLetterOrDigit() }
        var n = text.length
        if (n == 0) return ""

        var r = sqrt(n.toDouble()).toInt()
        var c = r

        while (r * c < n || c - r > 1) {
            if (r * c < n) { c++ }
            if (c - r > 1) {
                r++
                c = r
            }
        }

        val result = StringBuilder()

        for (col in 0 until c) {
            for (row in 0 until r) {
                val index = row * c + col
                if (index < n) {
                    result.append(text[index])
                } else {
                    result.append(" ")
                }
            }
            if (col != c - 1) {
                result.append(" ")
            }
        }

        return result.toString()
    }
}

