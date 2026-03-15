
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {

    public static void displayBlanks(ArrayList<Character> blanks) {
        System.out.print("Word: ");
        for (int i = 0; i < blanks.size(); i++) {
            System.out.print(blanks.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String word = "";
        try(BufferedReader reader = new BufferedReader(new FileReader("words.txt"))) {
            ArrayList<String> words=new ArrayList<>();
            String line;
            while((line=reader.readLine())!=null){
                words.add(line);
            }
            Random random=new Random();
            word=words.get(random.nextInt(0, words.size()));
            System.out.println(word);
        } catch (Exception e) {
        }
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> blanks = new ArrayList<>();
        int wrongCount = 0;

        for (int i = 0; i < word.length(); i++) {
            blanks.add('_');
        }

        System.out.println("WORD GUESS GAME STARTED");
        System.out.println("--------------------");

        while (wrongCount <= 6) {
            System.out.print("Guess a character: ");
            char c = sc.next().toLowerCase().charAt(0);
            if (word.indexOf(c) >= 0) {
                for (int i = 0; i < blanks.size(); i++) {
                    if (word.charAt(i) == c) {
                        blanks.set(i, c);
                    }
                }
                displayBlanks(blanks);
                if (blanks.indexOf('_') <= 0) {
                    break;
                }
            } else {
                wrongCount++;
                System.out.println("Wrong Guess!");
                displayBlanks(blanks);
            }
        }
        if (wrongCount >= 6) {
            System.out.println("You Lose!");
        } else {
            System.out.println("You Win!");
        }
    }
}
