object Pangram {
    fun isPangram(input: String): Boolean {
        var freq = mutableMapOf<Char, Int>()
        for (ch in input.lowercase()) {
            if (ch in 'a'..'z') {
                freq[ch] = freq.getOrDefault(ch, 0) + 1
                }
            }
        return freq.size == 26
        }
    }
