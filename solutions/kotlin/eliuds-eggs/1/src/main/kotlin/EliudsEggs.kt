object EliudsEggs {

    fun eggCount(number: Int): Int{
    var displayValue = number
    var count = 0
    
    while (displayValue > 0) {
        if (displayValue % 2 == 1) { 
            count++
        }
        displayValue /= 2  
    }
    
    return count
    }
}
