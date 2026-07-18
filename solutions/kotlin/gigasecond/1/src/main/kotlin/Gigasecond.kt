import java.time.LocalDateTime
import java.time.LocalDate
class Gigasecond(birthDateTime: LocalDateTime) {
    val date: LocalDateTime = birthDateTime.plusSeconds(1_000_000_000)
     constructor(birthDate: LocalDate) : this(birthDate.atStartOfDay())
    }
