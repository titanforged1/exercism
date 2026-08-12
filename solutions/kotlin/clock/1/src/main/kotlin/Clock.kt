class Clock {
    private var minutes = 0

    constructor(hours: Int, minutes: Int) {
        add(MINUTES_IN_HOUR * hours + minutes)
    }

    fun add(minutes: Int) {
        this.minutes = (this.minutes + minutes).mod(MINUTES_IN_DAY)
    }

    fun subtract(minutes: Int) =
        add(-minutes)

    override fun equals(other: Any?) =
        other is Clock && this.minutes == other.minutes

    override fun toString() =
        "%02d:%02d".format(minutes / MINUTES_IN_HOUR, minutes.mod(MINUTES_IN_HOUR))
}

private const val MINUTES_IN_HOUR = 60
private const val MINUTES_IN_DAY = 24 * MINUTES_IN_HOUR

