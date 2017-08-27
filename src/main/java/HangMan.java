import java.util.Scanner;

public class HangMan {

	private static String [] cities = { "madrid", "jeddah", "nairobi", "johannesburg", "kampala", "adelaide", "montreal", "dhaka",
    "shanghai", "bengaluru", "chennai", "budapest", "belgrade", "istanbul", "santiago" };
	private static String gameWord = cities[(int) (Math.random() * cities.length)];
	private static String dash = new String(new char[gameWord.length()]).replace("\0", "_");
    private static int count = 0;
    
    public String getRandom (){
        return gameWord;
    }

    public String [] getCities (){
        return cities;
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (count < 7 && dash.contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(dash);
			String guess = scanner.next();
			hang(guess);
		}
		scanner.close();
	}

	public static void hang(String guess) {
		String newDash = "";
		for (int i = 0; i < gameWord.length(); i++) {
			if (gameWord.charAt(i) == guess.charAt(0)) {
				newDash += guess.charAt(0);
			} else if (dash.charAt(i) != '*') {
				newDash += gameWord.charAt(i);
			} else {
				newDash += "*";
			}
		}

		if (dash.equals(newDash)) {
			count++;
			hangmanImage();
		} else {
			dash = newDash;
		}
		if (dash.equals(gameWord)) {
			System.out.println("Correct! You win! The word was " + gameWord);
		}
	}

	public static void hangmanImage() {
		if (count == 1) {
			System.out.println("Wrong guess");
			System.out.println("H");
		}
		if (count == 2) {
			System.out.println("Wrong guess");
			System.out.println("HA");
		}
		if (count == 3) {
			System.out.println("Wrong guess");
			System.out.println("HAN");
		}
		if (count == 4) {
			System.out.println("Wrong guess");
			System.out.println("HANG");
		}
		if (count == 5) {
			System.out.println("Wrong guess");
			System.out.println("HANGM");
		}
		if (count == 6) {
			System.out.println("Wrong guess");
			System.out.println("HANGMA");
		}
		if (count == 7) {
			System.out.println("Wrong guess");
            System.out.println("HANGMAN");
            System.out.println("Gameword was" + gameWord);
		}
	}
}
