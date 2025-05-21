package Day_7;
import java.util.*;

public class demo4 {
static void add(int a,int b) throws ArithmeticException{
	if(b==0) {
		throw new ArithmeticException("Invalid as zero cannot be divided");
	}
	int c=a/b;
	System.out.println(c);
}
	public static void main(String[] args) {
	try {
		add(10,0);
	}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	finally {
		System.out.println("Covered All Keywords");
	}
	}
}
		