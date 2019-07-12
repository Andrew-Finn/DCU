// Create a Word class with one static method called containsLetter
import java.util.Scanner;

public class Word
{
    public static boolean containsLetter(String word, char letter)
    {
        if (word.indexOf(letter) == -1) {
            return false;
        }
        return true;
        }
    }