import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Sentiment
{
    
    Double wordCount;
    
    String word;
    
    public Sentiment(String w)
    {
        this.word = w;
        this.wordCount = 0.0;
    }
    
    public Double findWord(String line)
    {
        String [] lineList = line.split(" ");
        for (String word: lineList)
        if (word.equals(this.word)){
            this.wordCount += 1.0;
            return Double.parseDouble(lineList[0]);
        }
        return 0.0;
    }
    
    public static double sentiment(String review, String reviewFilename)
    {
        String [] wordList = review.split(" ");
        
        Double score = 0.0;
        
        Double [] averageScores = new Double [wordList.length];
        
        try
        {
            int i = 0;
            for (String word: wordList)
            {
                Sentiment reviewWord = new Sentiment(word);
                
                Scanner in = new Scanner(new File(reviewFilename));
                
                Double tmp = 0.0;
                
                while (in.hasNextLine())
                {
                    String line = in.nextLine();
                    tmp += reviewWord.findWord(line);
                }
                score = tmp / reviewWord.wordCount;
                averageScores[i] = score;
                i++;
            }
            
            Double total = 0.0;
            
            for (int j = 0; j < averageScores.length; j++)
            {
                total += averageScores[j];
            }
            
            total = total / averageScores.length;
            
            return total;
        }
        catch (FileNotFoundException f)
        {
            return 0.0;
        }
        // This method will rate the review by finding the score for each of the words
        // and averaging them together.
    }
}