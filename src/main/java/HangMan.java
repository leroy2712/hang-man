import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class HangMan {
    //Array with words to be used in game
    String[] cities = { "madrid", "jeddah", "nairobi", "johannesburg", "kampala", "adelaide", "montreal", "dhaka",
            "shanghai", "bengaluru", "chennai", "budapest", "belgrade", "istanbul", "santiago" };

    //select random city from array
    public String random() {
        Random generateRandom = new Random();
        Integer random = generateRandom.nextInt(cities.length);
        String gameWord = cities[random];
        return gameWord;
    }

    //Split random city into array of it's constituent letters
    public String [] split (String word){
        String[] gameWordArray;
        gameWordArray = word.split("");
        return gameWordArray;
    }

    //Arraylist to represent hangman word
    public ArrayList<String> fillArrayList (String [] letterArray){
        ArrayList<String> filler = new ArrayList<String>();
        for (int i = 0; i < letterArray.length; i++){
            filler.add(i, "_");
        }
        return filler;
    }

    //Check if the user has guessed all letters correctly
    public boolean check (ArrayList<String> fillerArray){
        boolean wordStatus = true;
        for (int i = 0; i < fillerArray.size(); i++){
            String checkValue = "_";
            if(fillerArray.get(i) == checkValue){
                wordStatus = false;
                return wordStatus;
            }
        }
        return wordStatus;
    }

    //get user input and compare with word
    public ArrayList<String> compare (String userInput, String [] letterArray, ArrayList<String> fillerArray){
        for (int i = 0; i < letterArray.length; i++){
            if(letterArray[i] == userInput){
                fillerArray.set(i, userInput);
            }
        }
        return fillerArray;
    }

    //switch arraylist to string
    public String userGuess (ArrayList<String> fillerArray){
        String listString = String.join("", fillerArray);
        return listString;
    }
}