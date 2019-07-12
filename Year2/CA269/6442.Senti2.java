import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Senti2
{
	String word;
	int wordCount;
	
	public Senti2(String w)
	{
		this.word = w;
		this.wordCount = 0;
	}

	public int score(String s)
	{
        if (s.contains(this.word)){
            int review = Integer.valueOf(s.substring(0,1));
            this.wordCount++;
            return review;
        }
        else{
            return 0;
        }
	}

    public static void main(String [] args)
    {
        try
        {
            Scanner fileIn = new Scanner(new File(args[1]));
            
            String s = args[0];
            String line;
            
            Senti2 reviewWord = new Senti2(s);
            
            int score = 0;
            
            while (fileIn.hasNextLine())
            {
                line = fileIn.nextLine();
                int tmp = reviewWord.score(line);
                score += tmp;
            }
            
            Double average = 0.0;
            Double num = Double.valueOf(score);
            
            if (reviewWord.wordCount != 0){
                average = num / reviewWord.wordCount;
                String newS = String.format("%.2f", average);
                System.out.println(reviewWord.word + " appears " + reviewWord.wordCount + " times.");
                System.out.println("The average score of the reviews containing " + reviewWord.word + " is " + newS);
            }
            else{
                String newS = String.format("%.2f", 0.0);
                System.out.println(reviewWord.word + " appears " + reviewWord.wordCount + " times.");
                System.out.println("The average score of the reviews containing " + reviewWord.word + " is " + newS);
            }
            
        }
        catch (FileNotFoundException f)
        {
            System.exit(1);
        }
    }
}