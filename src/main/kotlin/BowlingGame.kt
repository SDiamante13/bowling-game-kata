data class BowlingGame(var score: Int = 0) {
    fun roll(pins: Int) {
        score += pins
    }

}
