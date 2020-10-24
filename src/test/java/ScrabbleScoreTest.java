import org.junit.Test;
import static org.junit.Assert.*;

public class ScrabbleScoreTest {
    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() {
        ScrabbleScore testScrabble = new ScrabbleScore();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }
    @Test
    public void calculateScore_returnScoreForTwoLetter_4() {
        ScrabbleScore testScrabble = new ScrabbleScore();
        Integer expected = 4;
        assertEquals(expected, testScrabble.calculateScore("ab"));
    }
    @Test
    public void calculateScore_returnScoreForThreeLetter_14(){
        ScrabbleScore testScrabble = new ScrabbleScore();
        Integer expected = 14;
        assertEquals(expected, testScrabble.calculateScore("abz"));
    }
}