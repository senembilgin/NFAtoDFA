import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    File fileName = new File("C:\\Users\\SENEM\\Documents\\senem ders\\CS 410\\inputs");
    {
        try {
            Scanner reader = new Scanner(fileName);
            NFA nfa = new NFA(reader);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot read the file");
            e.printStackTrace();
        }
    }

}
