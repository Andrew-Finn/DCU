// Create a Word class with one static method called showLetter

import java.util.Scanner;

public class Word
{
    public static String showLetter(String word, char guess)
    {
        String line = "";
        for(int i=0;i<word.length();i++)
        {
            if (word.charAt(i) != guess) {
                line += "_";
            }
            else{
            line += guess;
            }
        }
        return line;
    }
}