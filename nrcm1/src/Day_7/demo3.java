package Day_7;
import java.util.*;
public class demo3 {
    void add(int a,int b) {
        try {
            int c=a/b;
            System.out.println(c);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        demo3 d = new demo3();
        d.add(10, 0);
    }
}
