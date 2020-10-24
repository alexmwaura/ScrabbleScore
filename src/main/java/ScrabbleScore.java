import java.util.ArrayList;

public class ScrabbleScore {
    public Integer calculateScore(String word){
        ArrayList<Integer> scrabbleScore = new ArrayList<Integer>();
        String[] firstCase = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
        String[] secondCase = {"d", "g"};
        String[] thirdCase = {"b", "c", "m", "p"};
        String[] fourthCase = {"f", "h", "v", "w", "y"};
        int count = 0;
        for(char scrabble: word.toLowerCase().toCharArray()){
            String scrabbleString = String.valueOf(scrabble);
            for(String first: firstCase){
                if(first.equals(scrabbleString))scrabbleScore.add(1);
            }
            for(String second: secondCase){
                if(second.equals(scrabbleString)) scrabbleScore.add(2);
            }
            for(String third: thirdCase){
                if(third.equals(scrabbleString)) scrabbleScore.add(3);
            }
            for(String fourth: fourthCase){
                if(fourth.equals(scrabbleString)) scrabbleScore.add(4);
            }
            switch (scrabbleString){
                case "k":
                    scrabbleScore.add(5);
                    break;
                case "j":
                case "x":
                    scrabbleScore.add(8);
                    break;
                case "q":
                case "z":
                    scrabbleScore.add(10);
                    break;
            }
        }
        for(int integerScore: scrabbleScore){
            count =+ integerScore + count;
        }
        return count;
    }
}