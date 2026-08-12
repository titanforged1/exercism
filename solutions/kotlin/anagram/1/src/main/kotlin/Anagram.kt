class Anagram(private val target : String) {
    fun match(anagrams: Collection<String>): Set<String> {
        val targetLow = target.lowercase()
        var targetFreq = buildFrequencyMap(targetLow)
        return anagrams
        .filterNot { it.lowercase() == targetLow } 
        .filter { buildFrequencyMap(it.lowercase()) == targetFreq } .toSet()
        
        }
     private fun buildFrequencyMap(word: String): Map<Char, Int> {
         val freqMap = mutableMapOf<Char, Int>()
         for (c in word) {
             freqMap[c] = freqMap.getOrDefault(c, 0) + 1 }
         return freqMap
         }
    }
