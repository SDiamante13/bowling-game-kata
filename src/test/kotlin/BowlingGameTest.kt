import org.assertj.core.api.Assertions.*
import org.junit.Test

class BowlingGameTest {

    @Test
    fun `first frame bowler should have a score of 0`() {
        val bowlingGame = BowlingGame()

        assertThat(bowlingGame.score).isEqualTo(0)
    }
}