package examples;
import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        try {
            int index = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer index");
        } catch (Exception e) {
            System.out.println("Error occurred");
        }
    }
}
