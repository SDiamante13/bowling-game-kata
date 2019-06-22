data class BowlingGame(var score: Int = 0) {
    var frame = Frame()
    var spare: Boolean = false

    fun roll(pins: Int) {
        score += pins
        if (pins == 10) frame.frameNumber++
    }
}

data class Frame(var frameNumber: Int = 1)
