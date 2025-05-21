package Day_7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\HARSHA\\OneDrive\\Desktop\\Sample.java");
        try (Scanner reader = new Scanner(obj)) {
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
