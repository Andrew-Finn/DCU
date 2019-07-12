import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Sentiment
{
    
    String word;
    int count;
    int score;
    
    public Sentiment(String w)
    {
        this.word = w;
        this.count = 0;
        this.score = 0;
    }
    
    public void getScore(String line)
    {
        if (line.contains(this.word)){
            this.count++;
            this.score += Integer.valueOf(line.substring(0,1));
        }
    }
    
    public static double sentiment(String review, String reviewFilename)
    {
        try
        {
            Scanner fileIn = new Scanner(new File(reviewFilename));
            
            Double total = 0.0;
            
            String [] words = review.split(" ");
            List <String> notIgnored = new ArrayList<>();
            
            for(int i = 0; i < words.length; i++)
            {
                Double average = 0.0;
                
                Sentiment w = new Sentiment(words[i]);
                
                while (fileIn.hasNextLine())
                {
                    String line = fileIn.nextLine();
                    w.getScore(line);
                }
                
                if (w.count != 0){
                    average = Double.valueOf(w.score) / w.count;
                    if (average < 2.2 && average > 1.8){
                        average = 0.0;
                    }
                    else{
                        notIgnored.add(words[i]);
                    }
                    total += average;
                }
                
            }
            System.out.println(total);
            return total / notIgnored.size();
        }
        catch (FileNotFoundException error)
        {
            return 0.0;
        }
        // The review does not have a rating (i.e. a score).
        // This method will rate the review by finding the score for each of the words
        // and averaging them together.
    }
}