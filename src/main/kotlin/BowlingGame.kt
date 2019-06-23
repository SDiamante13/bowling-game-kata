data class BowlingGame(var score: Int = 0) {
    var frames = listOf(Frame(), Frame(), Frame(), Frame(), Frame(), Frame(), Frame(), Frame(), Frame(), Frame())
    var currentFrameIndex: Int = 0
    lateinit var currentFrame: Frame

    fun roll(pins: Int) {
        currentFrame = frames[currentFrameIndex]

        if (currentFrame.firstRoll == null) {
            currentFrame.firstRoll = pins

            if (currentFrameIndex != 0 && frames[currentFrameIndex-1].spareIndicator) {
                frames[currentFrameIndex - 1].frameTotal = frames[currentFrameIndex - 1].frameTotal!! + pins
                score += pins
            }
        } else {
            currentFrame.secondRoll = pins
            currentFrame.frameTotal = currentFrame.firstRoll!! + currentFrame.secondRoll!!

            if (currentFrame.frameTotal == 10) currentFrame.spareIndicator = true
            score += currentFrame.frameTotal!!
            currentFrameIndex++
        }
    }
}

data class Frame(
    var firstRoll: Int? = null,
    var secondRoll: Int? = null,
    var frameTotal: Int? = null,
    var spareIndicator: Boolean = false)
