import org.assertj.core.api.Assertions.*
import org.junit.Test

class BowlingGameTest {

    private val bowlingGame = BowlingGame()

    @Test
    fun `first frame bowler should have a score of 0`() {
        assertThat(bowlingGame.score).isEqualTo(0)
    }

    @Test
    fun `after 4 rolls (3, 4, 5, 4) the total score is 16`() {
        bowlingGame.roll(3)
        bowlingGame.roll(4)
        bowlingGame.roll(5)
        bowlingGame.roll(4)
        assertThat(bowlingGame.score).isEqualTo(16)
    }
}