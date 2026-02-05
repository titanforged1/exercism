
enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
    }
fun classify(naturalNumber: Int): Classification {
    if (naturalNumber <= 0){
        throw RuntimeException()
    }
    var aliquotSum = 0
    for (i in 1..naturalNumber / 2) {
        if (naturalNumber % i == 0) {
            aliquotSum += i
            }
        }
    return when {
        aliquotSum == naturalNumber -> Classification.PERFECT
        aliquotSum > naturalNumber  -> Classification.ABUNDANT
        else -> Classification.DEFICIENT
        }
    }
