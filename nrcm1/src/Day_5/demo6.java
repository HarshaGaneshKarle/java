package Day_5;

public class demo6 {
	public static void main() {
		System.out.println("Good Morning");
	}
	public static void main(int a ,int b) {
		System.out.println(a+b);
	}
	public static void main(double c,double d) {
		System.out.println(c-d);
	}
	public static void main(String s1,String s2) {
		System.out.println(s1+s2);
	}
public static void main(String[] args) {
	demo6 d6=new demo6();
	d6.main();
	d6.main(8,9);
	d6.main(9990,8765);
	d6.main("true"," detective");
}
}