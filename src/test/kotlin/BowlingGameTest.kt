import org.assertj.core.api.Assertions.*
import org.junit.Test

class BowlingGameTest {

    @Test
    fun `first frame bowler should have a score of 0`() {
        val bowlingGame = BowlingGame()

        assertThat(bowlingGame.score).isEqualTo(0)
    }

    @Test
    fun `bowls score of 5`() {
        val bowlingGame = BowlingGame()

        bowlingGame.roll(5)
        assertThat(bowlingGame.score).isEqualTo(5)
    }
}