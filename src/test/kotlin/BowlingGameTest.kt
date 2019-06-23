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

    @Test
    fun `rolls of 5 and 2 should go to the first frame`() {
        bowlingGame.roll(5)
        bowlingGame.roll(2)

        assertThat(bowlingGame.frames[0].firstRoll).isEqualTo(5)
        assertThat(bowlingGame.frames[0].secondRoll).isEqualTo(2)
    }

    @Test
    fun `all 0s should have a total score of 20 by end of game`() {
        for (times in 1..20) bowlingGame.roll(0)
        assertThat(bowlingGame.score).isEqualTo(0)

    }

    @Test
    fun `all 1s should have a total score of 20 by end of game`() {
        for (times in 1..20) bowlingGame.roll(1)
        assertThat(bowlingGame.score).isEqualTo(20)
    }

    @Test
    fun `a spare in the first frame followed by all misses, scores 16`() {
        bowlingGame.roll(5)
        bowlingGame.roll(5)
        bowlingGame.roll(3)
        for (times in 1..17) bowlingGame.roll(0)
        assertThat(bowlingGame.score).isEqualTo(16)
    }
}