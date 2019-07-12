import java.util.Scanner;

public class FindMatchingLetters
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two lines:");
        String line1 = in.nextLine();
        String line2 = in.nextLine();

        int numMatching = 0;
        for(int i = 0; i < line1.length(); i++){
            if(line1.charAt(i) == line2.charAt(i)){
                numMatching += 1;
            }
        }
        System.out.println("There are " + numMatching + " corresponding characters.");
    }
}