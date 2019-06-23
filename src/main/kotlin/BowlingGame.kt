data class BowlingGame(var score: Int = 0) {
    var frames = listOf(Frame(), Frame())
    var currentFrame: Int = 1

    fun roll(pins: Int) {
        score += pins
    }
}

data class Frame(
    var firstRoll: Int? = null,
    var secondRoll: Int? = null,
    var frameTotal: Int? = null)
