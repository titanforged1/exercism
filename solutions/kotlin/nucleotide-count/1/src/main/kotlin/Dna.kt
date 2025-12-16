class Dna(private val dna: String) {

    init {
        for (char in dna) {
            if (char !in listOf('A', 'C', 'G', 'T')) {
                throw IllegalArgumentException()
            }
        }
    }

    val nucleotideCounts: Map<Char, Int>
        get() {
            val counts = mutableMapOf(
                'A' to 0,
                'C' to 0,
                'G' to 0,
                'T' to 0
            )

            for (char in dna) {
                counts[char] = counts[char]!! + 1
            }

            return counts
        }
}
