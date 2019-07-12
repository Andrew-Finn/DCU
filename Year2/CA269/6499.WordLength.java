import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class WordLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> countmap = new HashMap<Integer, Integer>();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] words = line.split(" ");
            if (line.length() > 0) {
                for (String word : words) {
                    if (countmap.containsKey(word.length()))
                        countmap.put(word.length(), countmap.get(word.length()) + 1);
                    else
                        countmap.put(word.length(), 1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : countmap.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}
