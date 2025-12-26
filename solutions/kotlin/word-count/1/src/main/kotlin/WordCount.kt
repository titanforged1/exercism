object WordCount {
    fun phrase(phrase: String): Map<String, Int> {
        val freq = mutableMapOf<String , Int>()
        val regex = Regex("[a-z0-9]+(?:'[a-z0-9]+)?")
        for(match in regex.findAll(phrase.lowercase())){
            var word = match.value
            freq[word] = freq.getOrDefault(word, 0 ) + 1
            }
        return freq
        }
    }
