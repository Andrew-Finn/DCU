// Write your Hangman class here
import java.util.Scanner;

public class Hangman
{   
    public static String showLetters(String word, String guess)
    {
        String line = "";
        for(int i=0;i<word.length();i++)
        {
            if (guess.indexOf(word.charAt(i)) == -1) {
                line += "_";
            }
            else{
            line += guess.charAt(guess.indexOf(word.charAt(i)));
            }
        }
        System.out.println(line);
        return(line);
    }
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // First get the word
        int wordSeed = in.nextInt();

        String word = Word.getWord(wordSeed);
        System.out.println("The word is");
        String x = Hangman.showLetters(word, " ");
        String guess = "";
        while(x.indexOf("_") != -1){
            System.out.println("Guess a letter:");
            guess += in.next();
            x = Hangman.showLetters(word, guess);
        }
        System.out.println("Well Done, the word was " + word + ".");
        }
        // Now you have the word ... encourage the user to guess.
}