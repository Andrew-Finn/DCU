import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Senti3
{
	public static String round(Double result, int place)
	{
	    int rounder = 0;
	    Double returnValue;
	    String s = String.valueOf(result);
	    for (int i = 0; i < s.length(); i++)
	    {
	        if (s.charAt(i) == '.')
	        {
	            rounder = i;
	            break;
	        }
	    }
	    
	    if (s.length() < 5){
	        if (s.length() == 3){
	            return s + "0";
	        } else {
	            return s;
	        }
	    }
	    
	    char c = s.charAt(rounder + 3);
	    int num = Integer.parseInt(String.valueOf(c));
	    
	    if (num > 4){
            s = s.substring(0,rounder) + s.substring(rounder, rounder + 3);
            int value = Integer.parseInt(s.substring(rounder + 2, rounder + 3));
	        value++;
	        s = s.substring(0, s.length() - 1) + String.valueOf(value);
            return s;
	    }
	    else{
	        s = s.substring(0,rounder) + s.substring(rounder, rounder + 3);
            return s;
	    }
	}

	public static Double score(String s, String word)
	{
	    int countSpace = 0;
	    char space = '\f';
	    
	    for (int i = 0; i < s.length(); i++){
	        if (s.charAt(i) == space){
	            countSpace++;
	        }
	    }
	    
	    String [] wordList = s.split(" ", countSpace);
	    
	    for (int i = 0; i < wordList.length; i++){
	        if (wordList[i].equals(word)){
	            for (int j = 0; j < wordList.length; j++){
	                if (wordList[j].matches("[0-9]")){
	                    Double result = Double.parseDouble(wordList[j]);
	                    return result;
	                }
	            }
	        }
	    }
	    return -1.00;
	}

    public static void main(String [] args)
    {
        try
        {
            Scanner wordFileIn = new Scanner(new File(args[0]));
            
            Double score;
            Double wordCount;
                
            Double scoreReturn;
            
            while (wordFileIn.hasNext())
            {
                Scanner fileIn = new Scanner(new File(args[1]));
                
                String wordsInput = wordFileIn.next();
                
                score = 0.0;
                wordCount = 0.0;
                
                scoreReturn = 0.0;
                
                while (fileIn.hasNextLine())
                {
                    String line = fileIn.nextLine();
                    scoreReturn = score(line, wordsInput);
                    if (scoreReturn != -1){
                        score += scoreReturn;
                        wordCount += 1.0;
                    }
                }
                System.out.println("The score of " + wordsInput + " is " + round(score / wordCount, 2) + ".");
            }
        }
        catch (FileNotFoundException f)
        {
            System.exit(1);
        }
    }
}