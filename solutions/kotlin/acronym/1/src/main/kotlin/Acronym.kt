object Acronym {

    fun generate(phrase: String): String {

        val upper = phrase.uppercase()
        val noHyphen = upper.replace("-", " ")
        val cleaned = noHyphen
            .replace(".", "")
            .replace(",", "")
            .replace("!", "")
            .replace("'", "")
            .replace("_", "")
        val words = cleaned.split(" ")
        var result = ""
        for (word in words) {
            if (!word.isBlank()) {
                result += word.first()
            }
        }
        return result
    }
}

