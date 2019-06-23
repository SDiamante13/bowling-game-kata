data class BowlingGame(var score: Int = 0) {
    var frames = listOf(Frame(), Frame())
    var currentFrameIndex: Int = 0

    fun roll(pins: Int) {
        val currentFrame = frames[currentFrameIndex]

        if (currentFrame.firstRoll == null) {
            currentFrame.firstRoll = pins
        }
        score += pins
    }
}

data class Frame(
    var firstRoll: Int? = null,
    var secondRoll: Int? = null,
    var frameTotal: Int? = null)
