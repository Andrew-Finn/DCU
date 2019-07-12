// Create a Word class with a static method called allDone

import java.util.Scanner;

public class Word
{
    public static boolean allDone(String word, String guess)
    {
        for(int i=0;i<word.length();i++)
        {
            if (guess.indexOf(word.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
        }
    }