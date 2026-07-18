fun transcribeToRna(dna: String): String {
    val result = StringBuilder()

    for (char in dna) {
        val rnaChar = when (char) {
            'G' -> 'C'
            'C' -> 'G'
            'T' -> 'A'
            'A' -> 'U'
            else -> throw IllegalArgumentException()
        }
        result.append(rnaChar)
    }

    return result.toString()
}

