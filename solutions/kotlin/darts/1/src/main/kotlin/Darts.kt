import kotlin.math.sqrt

object Darts {
    fun score(x: Any, y: Any): Int {
        
        val xCoord = when (x) {
            is Number -> x.toDouble()
            else -> throw IllegalArgumentException()
        }
        
        val yCoord = when (y) {
            is Number -> y.toDouble()
            else -> throw IllegalArgumentException()
        }
    
        val distance = sqrt(xCoord * xCoord + yCoord * yCoord)
        
        return when {
            distance <= 1.0 -> 10   // İç daire (yarıçap = 1)
            distance <= 5.0 -> 5    // Orta daire (yarıçap = 5)
            distance <= 10.0 -> 1   // Dış daire (yarıçap = 10)
            else -> 0               // Hedef dışı
        }
    }
}