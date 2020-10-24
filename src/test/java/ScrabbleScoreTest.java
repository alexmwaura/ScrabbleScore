import org.junit.Test;

import static org.junit.Assert.*;

public class ScrabbleScoreTest {
    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        ScrabbleScore testScrabble = new ScrabbleScore();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }
}