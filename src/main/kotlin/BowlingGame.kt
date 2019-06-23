data class BowlingGame(var score: Int = 0) {
    var frames = listOf(Frame(), Frame())
    var currentFrameIndex: Int = 0
    lateinit var currentFrame: Frame

    fun roll(pins: Int) {
        currentFrame = frames[currentFrameIndex]

        if (currentFrame.firstRoll == null) {
            currentFrame.firstRoll = pins
        } else {
            currentFrame.secondRoll = pins
            currentFrame.frameTotal = currentFrame.firstRoll!! + currentFrame.secondRoll!!
            score += currentFrame.frameTotal!!
            currentFrameIndex++
        }
    }
}

data class Frame(
    var firstRoll: Int? = null,
    var secondRoll: Int? = null,
    var frameTotal: Int? = null)
