import org.assertj.core.api.Assertions.*
import org.junit.Test

class BowlingGameTest {

    private val bowlingGame = BowlingGame()

    @Test
    fun `first frame bowler should have a score of 0`() {
        assertThat(bowlingGame.score).isEqualTo(0)
    }

    @Test
    fun `bowls score of 5`() {
        bowlingGame.roll(5)
        assertThat(bowlingGame.score).isEqualTo(5)
    }

    @Test
    fun `bowls score of 5 and 3 in single frame and score should be 8`() {
        bowlingGame.roll(5)
        bowlingGame.roll(3)

        assertThat(bowlingGame.score).isEqualTo(8)
    }

    @Test
    fun `scoring 10 in one frame ends the frame`() {
        bowlingGame.roll(10)

        assertThat(bowlingGame.frame.frameNumber).isEqualTo(2)
    }
}