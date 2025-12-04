object Bob {
    fun hey(input: String): String {
        val mInput = input.trim()

        if(mInput == "") {
            return "Fine. Be that way!"
        }
        
        val letters = mInput.filter { it.isLetter() }
        val isYelling = letters.isNotEmpty() && letters.all { it.isUpperCase() }

       return when {
            isYelling && mInput.endsWith('?') -> "Calm down, I know what I'm doing!"
            isYelling -> "Whoa, chill out!"
            mInput.endsWith('?') -> "Sure."
            else -> "Whatever."
        }

    }
}
