//Exception handling
package Day_6;

public class demo5 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("hi");
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			System.out.println(e);
		}
	}
}
