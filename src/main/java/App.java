import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        System.out.println("Please write 'begin' to begin the game");
        Scanner begin = new Scanner(System.in);
        String start = begin.next();

        if (start == "begin") {
            HangMan hangman = new HangMan();
            String randomWord = hangman.random();
            String [] gamePlayWord = hangman.split(randomWord);
            ArrayList<String> fillerWord = hangman.fillArrayList(gamePlayWord);
            boolean status = hangman.check(fillerWord);

            if(status == false){
                Scanner myWord = new Scanner(System.in);
                ArrayList<String> comparison = hangman.compare(myWord.next(), gamePlayWord, fillerWord);
                String progress = hangman.userGuess(comparison);
                System.out.println(progress);
            }

        }
    }
}