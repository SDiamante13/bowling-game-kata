data class BowlingGame(var score: Int = 0, var frame: Int = 1) {

    fun roll(pins: Int) {
        score += pins
        if (pins == 10) frame++
    }
}
