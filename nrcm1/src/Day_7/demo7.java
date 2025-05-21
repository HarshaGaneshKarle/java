package Day_7;
import java.util.*;
public class demo7 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		try {
			System.out.println("Enter the class Name");
			String className=s1.next();
			Class.forName(className);
			System.out.println("The class found");
		}
		catch(ClassNotFoundException e) {
			System.out.println("The class is found"+e.getMessage());
		}finally {
			s1.close();
		}
	}

}
