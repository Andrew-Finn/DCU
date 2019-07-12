// Create a Word class with one static method called isFirstLetter

import java.util.Scanner;

public class Word
{
    public static boolean isFirstLetter(String word, char letter)
    {
        return(word.charAt(0)==letter);
    }
}