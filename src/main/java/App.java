import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void ScrabbleGame(String continuePlaying) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ScrabbleScore scrabbleScore = new ScrabbleScore();
        while(continuePlaying.equals("yes")){
            System.out.println("Enter a word that is in the English vocabulary");
            String scrabbleWord = bufferedReader.readLine();
            Integer userScore = scrabbleScore.calculateScore(scrabbleWord.toLowerCase());
            System.out.println("Your score is: " + userScore );
            System.out.println("Do you want to play again ?: Yes or No");
            continuePlaying = bufferedReader.readLine().toLowerCase();
        }
    }

    public static void main(String[] args) {
        System.out.println("Do you want to play a game of scrabble: Yes or No");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String userOption = bufferedReader.readLine().toLowerCase();
            if(userOption.equals("yes")){
                ScrabbleGame(userOption);
            }
            System.out.println("Thank you");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
