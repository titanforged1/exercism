object Isogram {

    fun isIsogram(input: String): Boolean {
        val seenLetters = mutableSetOf<Char>()

        for (char in input.lowercase()) {

            if (char == ' ' || char == '-') {
                continue
            }

            if (char in seenLetters) {
                return false
            }

            seenLetters.add(char)
        }

        return true
    }
}
