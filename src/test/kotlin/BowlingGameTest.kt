import org.assertj.core.api.Assertions.*
import org.junit.Test

class BowlingGameTest {

    private val bowlingGame = BowlingGame()

    @Test
    fun `first frame bowler should have a score of 0`() {
        assertThat(bowlingGame.score).isEqualTo(0)
    }
}