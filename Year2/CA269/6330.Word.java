// Create a Word class with one static method called showLetters

import java.util.Scanner;

public class Word
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
        return line;
    }
}