import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Suspicious {
    public static void main(String[] args){
        try {
            Scanner fileStudents = new Scanner(new File(args[0]));
            Scanner fileDelinquents = new Scanner(new File(args[1]));
            Set<String> setDelinquent = new HashSet<String>();
            Set<String> setStudent = new HashSet<String>();
            while (fileStudents.hasNext()) {
                String s = fileStudents.nextLine();
                setStudent.add(s);
            }
            while (fileDelinquents.hasNext()) {
                String s = fileDelinquents.nextLine();
                setDelinquent.add(s);
            }
            setDelinquent.retainAll(setStudent);
            String[] arrayDelinquents = setDelinquent.toArray(new String[0]);
            for (int i = 1; i < setDelinquent.size() + 1; i++)
                System.out.println(i + ". " + arrayDelinquents[i - 1]);
        } catch (FileNotFoundException e) {
            // insert code to run when exception occurs
        }
    }

}

