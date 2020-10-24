import java.util.ArrayList;

public class ScrabbleScore {
    public Integer calculateScore(String word){
        ArrayList<Integer> scrabbleScore = new ArrayList<Integer>();
        String[] firstCase = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
        int count = 0;
        for(char scrabble: word.toCharArray()){
            for(String fc: firstCase){
                String scrabbleString = String.valueOf(scrabble);
                if(fc.equals(scrabbleString)) {
                    scrabbleScore.add(1);
                }
            }
        }
        for(int integerScore: scrabbleScore){
            count =+ integerScore;
        }
        return count;
    }
}
//A, E, I, O, U, L, N, R, S, T       1
//        D, G                               2
//        B, C, M, P                         3
//        F, H, V, W, Y                      4
//        K                                  5
//        J, X                               8
//        Q, Z                               10